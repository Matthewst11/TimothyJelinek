// TO DO

import { createMedia, showHide } from "./media.js";

const btnToggle = document.getElementById("btn-show-hide");
const media = document.getElementById("media");

createMedia(media);

btnToggle.addEventListener("click", () => showHide(media, btnToggle));
