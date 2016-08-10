var context='';
var global = {
	init : function(param) {
		context=param;
		location.href=context+"/home.do";
	},
	to_douglas : function() {
		location.href=context+"/douglas.do";
	}
};


