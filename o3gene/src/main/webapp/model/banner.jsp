<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="rurl" value="${pageContext.request.scheme}${'://'}${pageContext.request.serverName}${':'}${pageContext.request.serverPort}${pageContext.request.contextPath}"/>

<!-- banner -->
<link href="${pageContext.request.contextPath }/css/banner.css"
	rel="stylesheet">

<div id="banner" class="search-area-wrapper">
	<div class="search-area container">
		<h3 class="search-header">搜索你想要的！</h3>
		<p class="search-tag-line font-mid-text"><a class="color-light">无人机</a>&nbsp;<a class="color-light">无人机</a>&nbsp;<a class="color-light">无人机</a>&nbsp;<a class="color-light">无人机</a>&nbsp;<a class="color-light">无人机</a>&nbsp;</p>
		<form id="search-form" class="search-form clearfix" method="get" action="#" autocomplete="off" novalidate="novalidate">
			<input class="search-term required" type="text" id="s" name="serachAll"
				placeholder="搜索商品或帖子" autocomplete="off">
			<input class="search-btn" type="submit" value="搜索">
		</form>
	</div>
</div>