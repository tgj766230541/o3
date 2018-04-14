<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="rurl" value="${pageContext.request.scheme}${'://'}${pageContext.request.serverName}${':'}${pageContext.request.serverPort}${pageContext.request.contextPath}"/>

<link href="${pageContext.request.contextPath }/css/log.css" rel="stylesheet">
<script type="text/javascript" src="${pageContext.request.contextPath }/js/log.js"></script>

<div id="logBox">
	<form id="logForm" method="post" action="${pageContext.request.contextPath}/regs/reg">
		<div class="logo-title">
			<div class="reg_forget">
				<a href="${pageContext.request.contextPath }/log.jsp">登录</a>
			</div>
		</div>
		<div class="form-group">
			<label class="log-item-label" for="usr">用户名:</label> <input autofocus
				type="text" class="form-control input-item" id="usr" placeholder="1-15位中文、字母或数字" name="nickName">
		</div>
		<div class="form-group">
			<label class="log-item-label" for="usr">手机号:</label> <input autofocus
				type="text" class="form-control input-item" id="usr" placeholder="手机号" name="phonum">
		</div>
		<div class="form-group">
			<label class="log-item-label" for="pwd">密码:</label> <input
				type="password" class="form-control input-item" id="pwd" placeholder="6-20位字母、数字" name="passWord">
		</div>
		<div class="form-group">
			<label class="log-item-label" for="gen">验证码:</label> <input
				type="text" class="form-control" id="gen" placeholder="图像验证码"> <img id="imgObj"
				alt="验证码"
				src="${pageContext.request.contextPath}/generateCode/getCode">
			<a class="changeImg">换一张</a><br />
		</div>
		<div class="form-group">
			<label class="log-item-label" for="gen">验证码:</label>
			<input type="text" class="form-control" id="gen" placeholder="手机验证码" name="phocode">
			<button type="button" class="btn button-weight color-white">获取短信验证码</button>
		</div>
		<div class="logo-title">
			<button type="submit" class="btn btn-primary">注&nbsp;&nbsp;&nbsp;&nbsp;册</button>
		</div>
	</form>
</div>