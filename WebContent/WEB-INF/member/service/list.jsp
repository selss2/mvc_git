<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원목록</title>
<link rel="stylesheet" href="../../css/member.css" />
<style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}

</style>
</head>
<body>
<div class="box">

	<h1>목록보기</h1> <br> 
	<table>
	  <tr>
	    <th>ID</th>
	    <th>이 름</th>
	    <th>등록일</th>
	    <th>생년월일</th>
	  </tr>
	  <tr>
	    <td>hong</td>
	    <td><a href="detail.jsp">홍길동</a></td>
	    <td>2016-07-03</td>
	    <td>901001</td>
	  </tr>
	   <tr>
	    <td>lee</td>
	    <td><a href="detail.jsp">이순신</a></td>
	    <td>2016-07-03</td>
	    <td>031001</td>
	  </tr>
	   <tr>
	    <td>song</td>
	    <td><a href="detail.jsp">송지효</a></td>
	    <td>2016-07-03</td>
	    <td>891001</td>
	  </tr>
	   <tr>
	    <td>park</td>
	    <td><a href="detail.jsp">박지성</a></td>
	    <td>2016-07-03</td>
	    <td>061001</td>
	  </tr>
	   <tr>
	    <td>kim</td>
	    <td><a href="detail.jsp">김유신</a></td>
	    <td>2016-07-03</td>
	    <td>851001</td>
	  </tr>
	</table>
	<a href="../../index.jsp">
		<img src="../../img/home.png" alt="home" style="width: 30px"/>
	</a>
	<a href="../member_controller.jsp">
		<img src="../../img/member.jpg" alt="member" style="width: 30px"/>
	</a>
</div>
</body>
</html>