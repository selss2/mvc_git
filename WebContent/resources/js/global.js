var global = {
	context : '',
	setContext : function(param) {
		this.context = param;
	},
	init : function(param) {
		this.setContext(param);
		document.querySelector('#bt_js_go')
		onclick=this.move();
		
	},
	move : function() {
		location.href=this.context+"/douglas.do";
	}
};


