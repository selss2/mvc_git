<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="member.MemberServiceImpl" %>
    <%@ page import="member.MemberService" %>
    <%@ page import="member.MemberBean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link rel="stylesheet" href="../../css/member.css" />
</head>
<body>
<div class="box">
	<%
		MemberService service = MemberServiceImpl.getInstance();
		MemberBean member = new MemberBean();
		
		%>	
		<form action="${context}/member/result/delete_result.jsp" method = "post">
	<input type="text" name ="confirm" value="" />
	<input type="hidden" name="id" value="<%=service.show().getId() %>" />
	
	<input type="submit" value="탈퇴" />
		<input type="reset" value="취소" />
	
	
	</form>
	<embed src="../../img/starwars.gif">
		<h1>탈퇴</h1> 
	<a href="../../index.jsp">
		<img src="../../img/home.png" alt="home" style="width: 30px"/>
	</a>
	<a href="../member_controller.jsp">
		<img src="../../img/member.jpg" alt="member" style="width: 30px"/>
	</a>
	</div>
	
</body>
</html>