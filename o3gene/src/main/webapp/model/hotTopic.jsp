<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="rurl"
	value="${pageContext.request.scheme}${'://'}${pageContext.request.serverName}${':'}${pageContext.request.serverPort}${pageContext.request.contextPath}" />

<!-- 热门话题 -->
<link href="${pageContext.request.contextPath }/css/hotTopic.css"
	rel="stylesheet">

<div class="hotT">
	<div class="left">
		<a href="#"><h3 class="color-base">你今天吃了吗</h3></a>
		<p class="font-mid-text deep-gray-color">你今天吃了吗你今天吃了吗你今天吃了吗你今天吃了吗你今天吃了吗你今天吃了吗你今天吃了吗</p>
	</div>
	<div class="right"><i class="fa fa-fire deep-color" aria-hidden="true"></i></div>
</div>