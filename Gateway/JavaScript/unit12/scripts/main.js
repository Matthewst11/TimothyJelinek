// Constants
const author = "Timothy Jelinek";     // Change it to your name

// DOM elements
const footer = document.querySelector("footer")
const nav = document.getElementById("top-nav");

// Update the DOM immediately
nav.innerHTML = `
    <ul>
        <li><a href="index.html">Home</a></li>
        <li><a href="about.html">About</a></li>
        <li><a href="contact.html">Contact</a></li>
    </ul>
`
footer.innerHTML = `&copy; ${author}. Open Source. MIT License`;