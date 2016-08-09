function showAlert(){
	alert('로딩 되자마자 팝업이 뜬다 !!');
}
function clickme() {
	document.getElementsByTagName('button')
	.onclick=showAlert();
}