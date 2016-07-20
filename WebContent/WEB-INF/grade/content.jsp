<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<style>
	div.memberClass{font-size: 20px}
</style>
<div id="" class="memberClass box">
	
	<h1>성적 관리</h1>
	<div style="width: 300px;margin: 0 auto;text-align: left;">
	<ol>
		<li><a href="${context}/grade/regist.do">등록</a></li>
		<li><a href="${context}/grade/update.do">수정</a></li>
		<li><a href="${context}/grade/delete.do">삭제</a></li>
		<li><a href="${context}/grade/list.do">목록 </a></li>
		<li><a href="${context}/grade/count.do">카운트</a></li>
		<li><a href="${context}/grade/search.do">검색 </a></li>
	</ol>
	</div>
	<a href="../index.jsp">
		<img src="../img/home.png" alt="home" style="width: 30px"/>
	</a>
</div>



