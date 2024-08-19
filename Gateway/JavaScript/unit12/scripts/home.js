// TO DO

import { createMedia, showHide } from "./media.js";

const btnToggle = document.getElementById("btn-show-hide");
const media = document.getElementById("media");
const title = document.getElementById("title");

title.innerHTML = "Welcome to my home page!";
createMedia(media);

btnToggle.addEventListener("click", () => showHide(media, btnToggle));
