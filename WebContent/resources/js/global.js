var aaa = {
	context : '',
	setContext : function(param) {
		this.context = param;
	},
	init : function(param) {
		this.setContext(param);
		var bt = document.querySelector('#bt_js_go');
		bt.onclick=this.move();
		
	},
	move : function() {
		location.href=this.context+"/douglas.do";
	}
};
function test2() {
	alert('222');
}
var test = {
		init : function(){
			alert('0000');
		}
};
function test3(){
	alert('===');
}

