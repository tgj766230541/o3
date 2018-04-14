<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="rurl"
	value="${pageContext.request.scheme}${'://'}${pageContext.request.serverName}${':'}${pageContext.request.serverPort}${pageContext.request.contextPath}" />

<!-- 头部导航样式2 -->
<!-- css/js -->
<link href="${pageContext.request.contextPath }/css/topBar2.css"
	rel="stylesheet">

<div id="topBar2">
	<div class="topBar2-base">
		<div class="top-main">
			<a href="${rurl}"><i class="top-logo">o3&nbsp;gene</i></a><a href="${rurl}"><span
				class="top-index">首页</span></a>
		</div>
	</div>
</div>