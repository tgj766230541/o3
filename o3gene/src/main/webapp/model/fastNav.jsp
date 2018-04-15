<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="rurl"
	value="${pageContext.request.scheme}${'://'}${pageContext.request.serverName}${':'}${pageContext.request.serverPort}${pageContext.request.contextPath}" />

<!-- 热门话题 -->
<link href="${pageContext.request.contextPath }/css/fastNav.css"
	rel="stylesheet">

<div class="fastN">
	<div class="title">快捷导航</div>
	<c:forEach begin="1" end="2">
		<div>
			<div class="item"><i class="fa fa-angle-right" aria-hidden="true">&nbsp;&nbsp;&nbsp;</i><a class="dot-font" href="#">Home</a></div>
			<div class="item"><i class="fa fa-angle-right" aria-hidden="true">&nbsp;&nbsp;&nbsp;</i><a class="dot-font" href="#">Articles List</a></div>
		</div>
	</c:forEach>
</div>