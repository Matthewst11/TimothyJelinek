// TO DO

const media = {
    audio: {id:'audio-WiiTheme', src : 'WiiTheme.mp3'}
}

const createMedia = (el) =>{
    const audioTag = `<audio id = "${media.audio.id}" src = "${media.audio.src}" controls></audio>`;
    el.innerHTML = audioTag;
}

const destroyMedia = (el) => {
    el.innerHTML = "";
}

const showHide = (el, button) => {
    let status = el.style.display;
    if(status == "none") {
        el.style.display = "Block";
        button.innerText = "Hide";
        button.className = "red";
        createMedia(el);
    }
    else {
        el.style.display = "None";
        button.innerText = "Show";
        button.className = "white";
        destroyMedia(el);
    }
}

export {createMedia, showHide}