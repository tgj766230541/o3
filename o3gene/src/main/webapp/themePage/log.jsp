<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="rurl" value="${pageContext.request.scheme}${'://'}${pageContext.request.serverName}${':'}${pageContext.request.serverPort}${pageContext.request.contextPath}"/>

<link href="${pageContext.request.contextPath }/css/log.css" rel="stylesheet">
<script type="text/javascript" src="${pageContext.request.contextPath }/js/log.js"></script>

<div id="logBox">
	<form id="logForm" method="post" action="${pageContext.request.contextPath}/logs/log">
		<div class="logo-title">
			<div class="reg_forget">
				<a href="#">忘记密码</a>&nbsp;&nbsp;&nbsp;<a href="${pageContext.request.contextPath }/reg.jsp">注册</a>
			</div>
		</div>
		<div class="form-group">
			<label class="log-item-label" for="usr">账号:</label> <input autofocus
				type="text" class="form-control input-item" id="usr" placeholder="手机号/身份证号" name="phonum">
		</div>
		<div class="form-group">
			<label class="log-item-label" for="pwd">密码:</label> <input
				type="password" class="form-control input-item" id="pwd" name="passWord">
		</div>
		<div class="form-group">
			<label class="log-item-label" for="gen">验证码:</label> <input
				type="text" class="form-control" id="gen">&nbsp;<img id="imgObj" alt="验证码"
				src="${pageContext.request.contextPath}/generateCode/getCode">
			<a class="changeImg">换一张</a><br />
		</div>
		<div class="logo-title">
			<button type="submit" class="btn btn-primary">登&nbsp;&nbsp;&nbsp;&nbsp;录</button>
		</div>
	</form>
</div>