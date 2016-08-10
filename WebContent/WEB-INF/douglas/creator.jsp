<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="../global/top.jsp"/>
<jsp:include page="../global/header.jsp"/>
<jsp:include page="../global/navi.jsp"/>
<script src="${js}/douglas.js"></script>
<link rel="stylesheet" href="${css}/douglas.css" />
<div id="container">
<section id="formbox">
	<p>Creator 학습장</p>
	<input type="text" id="name" name="name" value="" />
	<input type="text" id="ssn" name="ssn" value="" />
	<button id="bt_spec_show">회원정보 보기</button>
</section>
<section>
	<p>회원 정보</p>
	<article id="name"></article>
	<article id="age"></article>
	<article id="gender"></article>
</section>

</div>
<jsp:include page="../global/footer.jsp"/>
<jsp:include page="../global/end.jsp"/>
<script>
window.onload=init();

</script>