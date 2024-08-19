var nameComplete = false;
var playersComplete = false;
var systemsComplete = false;
var gamemodeComplete = true;
/* global variables referencing sidebar h2 and p elements */
var messageHeadElement = document.getElementById("messageHead");
var messageElement = document.getElementById("message");
/* global variables referencing fieldset elements */
var playersFieldset = document.getElementsByTagName("fieldset")[0];
var systemsFieldset = document.getElementsByTagName("fieldset")[1];
var nameFieldset = document.getElementsByTagName("fieldset")[2];
var gamemodeFieldset = document.getElementsByTagName("fieldset")[3];
/* global variables referencing text input elements */
var nameBox = document.forms[0].year;
var playersBox = document.forms[0].players;
/* verify players text box entry is a positive number */
function verifyPlayers() {
   var validity = true;
   var message = "";
   try{
      if (playersBox.value < 0 ){
         throw "Number of players needs to be positive.";
      }
   }
   catch (message){
      validity = false;
      messageText = message;
      nameBox.value = "";
   }
   finally{
      playersComplete = validity;
      messageElement.innerHTML = messageText;
      messageHeadElement.innerHTML = "";
   }
}
// verify at least one system checkbox is checked
function verifySystems() {try { 
    for (var i =0; i <5; i++) { 
        if (systemsFieldset.getElementsByTagName("input")[i].checked) {
           systemsComplete =true; 
           messageElement.innerHTML =""; // clear previous  message or recommendation       
           i =6;
      }
   }
   if (i ===5) {
      throw"Please select at least one system.";
       }
       }catch(message) { 
          systemsComplete =false; 
          messageHeadElement.innerHTML =""; // remove any former recommendation heading     
          messageElement.innerHTML = message; // display error message 
          }
         }
function verifyName() {
   var validity = true;
   var message = "";
   try{
      if (nameBox.value < 0 ||nameBox.value > 2023){
         throw "Year should be below 2023 and higher than 0";
      }
   }
   catch (message){
      validity = false;
      messageText = message;
      yearBox.value = "";
   }
   finally{
      yearComplete = validity;
      messageElement.innerHTML = messageText;
      messageHeadElement.innerHTML = "";
   }
}
// create event listeners for all input elements 
function createEventListeners() {
   playersBox.value = ""; // clear players text box on page load
   nameBox.value = ""; // clear year text box on page load

   if (playersBox.addEventListener) {
     playersBox.addEventListener("input", verifyPlayers, false); 
   } else if (playersBox.attachEvent)  {
     playersBox.attachEvent("onchange", verifyPlayers);
   }
   var systemsBox;
   for (var i = 0; i < 5; i++) {
      systemsBox = systemsFieldset.getElementsByTagName("input")[i];
      systemsBox.checked = false;      
      if (systemsBox.addEventListener) {
        systemsBox.addEventListener("click", verifySystems, false); 
      } else if (systemsBox.attachEvent)  {
        systemsBox.attachEvent("onclick", verifySystems);
       }
        }
    if (nameBox.addEventListener) {
     nameBox.addEventListener("input", verifyName, false); 
   } else if (nameBox.attachEvent)  {
     nameBox.attachEvent("onchange", verifyName);
   } 
var gamemodeBox;
   for (var i = 0; i < 3; i++) {
      gamemodeBox = gamemodeFieldset.getElementsByTagName("input")[i];
      gamemodeBox.checked = false;      
      if (gamemodeBox.addEventListener) {
        gamemodeBox.addEventListener("click", verifyGamemode, false); 
      } else if (gamemodeBox.attachEvent)  {
        gamemodeBox.attachEvent("onclick", verifyGamemode);
      }
   }
// }
// create event listeners when page finishes loading 
if (window.addEventListener) {
   window.addEventListener("load", createEventListeners, false);
} else if (window.attachEvent) {
   window.attachEvent("onload", createEventListeners);
}
}
