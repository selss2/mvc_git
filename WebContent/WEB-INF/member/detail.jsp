<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="member.MemberServiceImpl" %>
<%@ page import="member.MemberService" %>
<%@ page import="member.MemberBean" %>
<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>상세보기</title>
<link rel="stylesheet" href="${context}/css/member.css" />
<style>
#member_detail{border: 1px solid gray;width:100%;height:400px;margin:0 auto; border-collapse: collapse;}
#member_detail tr{border: 1px solid gray;hetigh:20%}
#member_detail tr td{border: 1px solid gray;}
.font_bold{font-weght:bold;}
.bg_color_yellow{background-color: yellow}
</style>
</head>
<body>
<!-- //id, name, ssn, birth, regDate, gender, proImg -->
<div class="box">
		<h1>회원상세정보</h1>
		<%
		MemberService service = MemberServiceImpl.getInstance();
		MemberBean member = new MemberBean();
		
		if(service.show().getId() == ""){
			%>
			<h1>로그인을 해주세요.</h1>
			<%
		} else {
			application.log("JSP 에서 보이는 생년월일 : "+service.show().getBirth());
		%>		
		
		
		<table id="member_detail">
				<tr>
				<td rowspan="4" style="width:30%">
				<img src="${img}/member/<%=service.show().getProfileImg()%>" alt="W3Schools.com" width="104"
			height="142"></td>
				<td style="width:20%" class="font_bold bg_color_yellow">ID</td>
				<td style="width:40%"><%= service.show().getId() %></td>
			</tr>
			<tr>
				
				<td class="font_bold bg_color_yellow">이 름</td>
				<td><%= service.show().getName() %></td>
			</tr>
			
			<tr>
				
				<td class="font_bold bg_color_yellow">성 별</td>
				<td><%= service.show().getGender() %></td>
			</tr>
			<tr>
				
				<td class="font_bold bg_color_yellow">이메일</td>
				<td><%= service.show().getEmail() %></td>
			</tr>
			<tr>
				<td class="font_bold bg_color_yellow">생년월일</td>
				<td colspan="2"><%= service.show().getBirth() %></td>
			</tr>
			<tr>
				<td class="font_bold bg_color_yellow">등록일</td>
				<td colspan="2"><%= service.show().getRegDate() %></td>
				
			</tr>
		</table>
		
		<%
		}
		%>
		<br /> 
		<p>
			
		</p>
		<a href="${context}/member/member_controller.jsp">
<img src="${img}/member.jpg" alt="member" style="width:30px" /></a>
<a href="${context}/index.jsp">
		<img src="${img}/home.png" alt="member" style="width:30px" />
		</a>

	</div>
</body>
</html>