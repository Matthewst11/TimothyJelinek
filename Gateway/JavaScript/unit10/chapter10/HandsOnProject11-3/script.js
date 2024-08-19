/*  JavaScript 6th Edition
    Chapter 11
    Hands-on Project 11-3

    Author: Timothy Jelinek
    Date:   4/7/2022

    Filename: script.js
*/

"use strict";

var httpRequest =  false;

 function getRequestObject() {
 	 try{ 
 	 	httpRequest = new XMLHttpRequest();
 	 }
 	 catch (requestError) {
	 }//end try catch

	 return httpRequest;

 }//end function



function stopSubmission(evt) { 
	if (evt.preventDefault) {
		evt.preventDefault(); 
	} else {
		evt.returnValue = false;
	}//end if/else

		getQuote();
}//end function

function getQuote() {
	if (document.getElementsByTagName("input")[0].value) {
		entry = document.getElementsByTagName("input")[0].value; 
	}//end if

	if (!httpRequest) {
		httpRequest = getRequestObject();
	}//end if

	httpRequest.abort(); 
	httpRequest.open("get","StockCheck.php?t=" + entry, true);
	httpRequest.send(); 
	httpRequest.onreadystatechange = displayData;
}//end function


function displayData() { 

	if(httpRequest.readyState === 4 && httpRequest.status === 200) { 
		var stockResults = httpRequest.responseText; 
		var stockItems = stockResults.split(/,|\"/); 

		for(var i = stockItems.length - 1; i >= 0; i--) {

			if(stockItems[i] === "") { 
				stockItems.splice(i, 1);
			}//end if

		}//end for

		var articleEl = document.getElementsByTagName("article")[0]; 
		document.getElementById("ticker").innerHTML = stockItems[0]; 
		document.getElementById("openingPrice").innerHTML = stockItems[6]; 
		document.getElementById("lastTrade").innerHTML = stockItems[1]; 
		document.getElementById("lastTradeDT").innerHTML = stockItems[2] + ", " + stockItems[3]; 
		document.getElementById("change").innerHTML = stockItems[4]; 
		document.getElementById("range").innerHTML =  (stockItems[8] * 1).toFixed(2) + " &ndash; " +(stockItems[7] * 1).toFixed(2); 
		document.getElementById("volume").innerHTML = (stockItems[9] * 1).toLocaleString(); 
		var chartSrc = "https://sandbox.iexapis.com/stable/stock/$TickerSymbol/batch?types=quote&range=1m&last=10&token=Tsk_d5ea71c8c07e42938ef76260650e269a" + entry; 
		document.getElementById("chart").src = chartSrc; 
		document.getElementById("chart").style.display = "inline";

	}//end if
}//end function


function formatTable() { 

	var rows = document.getElementsByTagName("tr"); 

		for (var i = 0; i < rows.length; i = i + 2) {
			rows[i].style.background = "#9FE098";
		}//end for 
}//end function


var form = document.getElementsByTagName("form")[0]; 
	if (form.addEventListener) {
		form.addEventListener("submit", stopSubmission, false); 
		window.addEventListener("load", formatTable, false); 
		window.addEventListener("load", getQuote, false);
	} else if (form.attachEvent) { 
		form.attachEvent("onsubmit", stopSubmission); 
		window.attachEvent("onload", formatTable); 
		window.attachEvent("onload", getQuote);
	}//end else/if

