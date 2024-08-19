// Shopping Cart Assignment

// You can use this data for seeding your cart
// Or you can create your own

let books = [
    {
        title: 'Apps',
        qty: 1,
        price: 11.99
    },
    {
        title: 'Programs',
        qty: 1,
        price: 4.99
    },
    {
        title: 'Functions',
        qty: 1,
        price: 10.99
    },
];

onload = () => {

    // check if localStorage
    const theCart = localStorage.getItem("theCart");
    // if it exists
    if (theCart) {
        // load
        books = JSON.parse(theCart);
    }
    buildCart();
    updateCount();
    updateTotal();

    //const btnNew = document.querySelector("#new")
    //btnNew.addEventListener("click", addItem)
    $("#new").on("click", addItem);
    

    //const btnSave = document.querySelector("#save")
    //btnSave.addEventListener("click", saveCart)
    $("#save").on("click", saveCart);
}

const buildCart = () => {
    var tbody = document.querySelector("tbody");
    tbody.innerHTML = "";
    //var tbody = $("tbody")[0];
    //tbody.html("");
    let i = 0;
    for (let book of books) {
        let str = `
            <tr id="tr_${i}">
                <td>
                    <input onkeyup="updateData(this,${i}, 'title')" class="title" value="${book.title}"></input>
                </td>
                <td>
                    <input onkeyup="updateData(this,${i}, 'qty')" class="qty" size="2" value="${book.qty}"></input>
                </td>
                <td>
                    <input onkeyup="updateData(this,${i}, 'price')" size="2" value="${book.price}"></input>
                </td>
                <td>${book.price}</td>
                <td id="book_${i}">${updateLineTotal(book)}</td>
                <td>
                    <button onclick="removeItem(${i})">
                        Remove
                    </button>
                </td>
            </tr>`
            ;
        tbody.innerHTML += str;
        //tbody.html(tbody.html(str));
        i++;
    }
}

const updateData = (el, i, field) => {
    let val = el.value;
    if (field == "qty") {
        books[i].qty = parseInt(val);
    }
    else if (field === "price") {
        books[i].price = parseFloat(val);
    }
    else {
        books[i].title = val;
    }
    updateTotal();
    let total = updateLineTotal(books[i]);
    document.querySelector("#book_" + i).innerHTML = total;
    //$("#book_" + i).html(total)
}

const addItem = () => {
    let book = {
        title: '',
        qty: 0,
        price: 0.00
    }

    books.push(book);
    buildCart();
    updateCount();
    updateTotal();
}

const saveCart = () => {
    localStorage.setItem("theCart", JSON.stringify(books));
}

const updateCount = () => {
    // document.querySelector("#book-count").innerHTML = books.length;
    $("#book-count").html(books.length)
}

const updateTotal = () => {
    var total = 0;
    for (let book of books) {
        total += book.price * book.qty
    }
    document.querySelector("#total").innerHTML = total.toFixed(2)
    //$("#total").html(total.toFixed(2))
}

const updateLineTotal = (book) => {
    return (book.price * book.qty).toFixed(2)
}

const removeItem = (id) => {
    document.getElementById("tr_" + id).remove();
    books.splice(id, 1)
    updateCount();
    updateTotal();
}