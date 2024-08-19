/*
      JavaScript 6th Edition
      Chapter 12
      Hands-on Project 12-1

      Author: Timothy Jelinek
      Date:   4/13/2022

      Filename: scrpt.js
 */

function display(event) {
    $(event.currentTarget).next().fadeIn("slow");
}
$("h3").click(display);