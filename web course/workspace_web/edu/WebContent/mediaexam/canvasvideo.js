var canvas, video;
function initiate(){
  var elem=document.getElementById('canvas');
  canvas=elem.getContext('2d');
  video=document.getElementById('media');

  video.addEventListener('click', push, false);
}
function push(){
  if(!video.paused && !video.ended){
    video.pause();
    window.clearInterval(loop);
  }else{
    video.play();
    loop=setInterval(processFrames, 33);
  }
}
function processFrames(){
  canvas.drawImage(video,0,0);

  var info=canvas.getImageData(0,0,483,272);
  var pos;
  var gray;
  for(x=0;x<=483;x++){
    for(y=0;y<=272;y++){
      pos=(info.width*4*y)+(x*4);
      gray=parseInt(info.data[pos]*0.2989 + info.data[pos+1]*0.5870 + info.data[pos+2]*0.1140);
      info.data[pos]=gray;
      info.data[pos+1]=gray;
      info.data[pos+2]=gray;
    }
  }
  canvas.putImageData(info,0,0);
}
window.addEventListener("load", initiate, false);



