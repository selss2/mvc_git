function gohome(context){
		location.href=context+"/home.do";
}
function start(aaa){
	document.getElementById('atag')
	.onclick=gohome(aaa);
}
