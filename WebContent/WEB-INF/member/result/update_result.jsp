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
<link rel="stylesheet" href="../../css/member.css" />
</head>
<body>
<div class="box">

<h1>정보수정 페이지 </h1>


	<%
	MemberService service = MemberServiceImpl.getInstance();
	MemberBean member = service.findById(request.getParameter("id"));
	String pw = request.getParameter("pw");
	String email = request.getParameter("email");
		
			member.setPw(pw);
			member.setEmail(email);
			
			service.update(member);
			response.sendRedirect("");
			
		%>



<a href="${context}/memberController.jsp">
<img src="${img}/member.png" alt="member" style="width:30px" /></a>
<a href="${context}/index.jsp">
		<img src="${img}/home.png" alt="member" style="width:30px" />
		</a>


</div>
</body>
</html>