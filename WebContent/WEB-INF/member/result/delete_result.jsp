<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="member.MemberServiceImpl" %>
    <%@ page import="member.MemberService" %>
    <%@ page import="member.MemberBean" %>
<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${css}/member.css" />
</head>
<body>

<div class="box">
<embed src="${img}/star.gif">
<h1>탈퇴 페이지</h1>
<% 
	MemberService service = MemberServiceImpl.getInstance();
	MemberBean member = new MemberBean();
	String id = request.getParameter("id");
	String pw = request.getParameter("confirm");
	member.setId(id);
	member.setPw(pw);
	service.delete(member);
	response.sendRedirect("/index.jsp");
%>

</div>
</body>
</html>