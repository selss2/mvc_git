<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="top.jsp"/>
<link rel="stylesheet" href="${css}/global.css" />
<jsp:include page="header.jsp"/>
<jsp:include page="navi.jsp"/>
	<div id="section" >
		<button id="button" onclick="showAlert()" style="margin:0 auto;">
			CLICK ME 
		</button>
	</div>
	
<jsp:include page="footer.jsp"/>
<jsp:include page="end.jsp"/>
<script>
	function showAlert(){
		alert('로딩 되자마자 팝업이 뜬다 !!');
	}
	function clickme() {
		document.getElementsByTagName('button')
		.onclick=showAlert();
	}
	window.onload=clickme();
</script>

