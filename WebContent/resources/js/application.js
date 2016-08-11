// var application = (function(){})();  IIFE 패턴
var application = (function(){
	var context='';
	var init = function(param) {
		context=param;
		location.href=context+"/home.do";
	};
	var to_douglas = function() {
		location.href=context+"/douglas.do";
	};
	var getContextPath = function(){
		return context;
	};
	return {
		init : init,
		to_douglas : to_douglas,
		getContextPath : getContextPath
	}
})();


