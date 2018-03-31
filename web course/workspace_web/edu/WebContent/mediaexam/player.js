function initiate() {
  maxim=600;
  mmedia=document.getElementById('media');
  play=document.getElementById('play');
  bar=document.getElementById('bar');
  progress=document.getElementById('progress');

  play.addEventListener('click', push, false);
  bar.addEventListener('click', move, false);
}

function push(){
  if(!mmedia.paused && !mmedia.ended) {
    mmedia.pause();
    play.innerHTML='재생';
    window.clearInterval(loop);
  }else{
    mmedia.play();
    play.innerHTML='중단';
    loop=setInterval(status, 1000);
  }
}
function move(e){
  if(!mmedia.paused && !mmedia.ended){
    var mouseX=e.pageX-bar.offsetLeft;
    var newtime=mouseX*mmedia.duration/maxim;
    mmedia.currentTime=newtime;
    progress.style.width=mouseX+'px';
  }
}
function status(){
  if(!mmedia.ended){
    var size=parseInt(mmedia.currentTime*maxim/mmedia.duration);
    progress.style.width=size+'px';
  }else{
    progress.style.width='0px';
    play.innerHTML='Play';
    window.clearInterval(loop);
  }
}

window.addEventListener('load', initiate, false);


















