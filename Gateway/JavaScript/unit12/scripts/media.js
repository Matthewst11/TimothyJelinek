// TO DO

const media = {
    video: {id:'video-lighthouse', src :'media/lighthouse.m4a'},
    audio: {id:'audio-podcast', src : 'media/podcast.mp3'}
}

const createMedia = (el) =>{
    const videoTag = `<video id = "${media.video.id}" src = "${media.video.src}" controls></video>`;
    const audioTag = `<audio id = "${media.audio.id}" src = "${media.audio.src}" controls></audio>`;
    el.innerHTML = videoTag + audioTag;
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