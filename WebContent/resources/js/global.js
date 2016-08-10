var context = {
	path : '',
	init : function(param) {
		context.path=param;
		index.go_home();
	}
};
var index = {
	go_home : function (){
		location.href=context.path+"/home.do";
	}
}
var global = {
	init : function() {
		document.querySelector('#bt_modern_js')
		.addEventListener('click',douglas.to_modernjs,false);
	}
}

