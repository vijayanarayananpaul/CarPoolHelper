<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<title>Car Pool App Login</title>
<%@include file="/resources/include.jsp"%>

<link rel='stylesheet prefetch'
	href='http://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900|RobotoDraft:400,100,300,500,700,900'>
<link rel='stylesheet prefetch'
	href='http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css'>
<%-- <link rel="stylesheet" href="${pageContext.request.contextPath}/css/reset.css"> --%>

<script	src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<!-- <script src="/js/index.js"></script> -->
</head>

<body>
<c:out value="${myContext}"></c:out>
	<div class="pen-title"> ${pageContext.request.contextPath}
		<h1>Car Pool Login</h1>
	</div>
	<div class="rerun">
		<a href="">Reset Pen</a>
	</div>
	<div class="container">
		<div class="card"></div>
		<div class="card">
			<h1 class="title">Login</h1>
			<form:form method="Post" action="/carPoolApp/loginApp" modelAttribute="loginBean">
				<div class="input-container">
					<form:input type="text" path="Username" id="Username" required="required" /> <label
						for="Username">Username</label>
					<div class="bar"></div>
				</div>
				<div class="input-container">
					<form:input type="password" id="Password" path="password" required="required" /> <label
						for="Password">Password</label>
					<div class="bar"></div>
				</div>
				<div class="button-container">
					<button type="submit">
						<span>Go</span>
					</button>
				</div>
				<div class="footer">
					<a href="#">Forgot your password?</a>
				</div>
			</form:form>
		</div>
		<div class="card alt">
			<div class="toggle"></div>
			<h1 class="title">
				Register
				<div class="close"></div>
			</h1>
			<form>
				<div class="input-container">
					<input type="text"  id="Username" required="required" /> <label
						for="Username">Username</label>
					<div class="bar"></div>
				</div>
				<div class="input-container">
					<input type="password" id="Password" required="required" /> <label
						for="Password">Password</label>
					<div class="bar"></div>
				</div>
				<div class="input-container">
					<input type="password" id="Repeat Password" required="required" />
					<label for="Repeat Password">Repeat Password</label>
					<div class="bar"></div>
				</div>
				<div class="button-container">
					<button>
						<span>Next</span>
					</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>
