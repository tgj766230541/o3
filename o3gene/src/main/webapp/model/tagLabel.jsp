<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="rurl"
	value="${pageContext.request.scheme}${'://'}${pageContext.request.serverName}${':'}${pageContext.request.serverPort}${pageContext.request.contextPath}" />

<!-- 热门话题 -->
<link href="${pageContext.request.contextPath }/css/tagLabel.css"
	rel="stylesheet">

<div class="tagL">
	<div class="title">话题标签</div>
	<div>
		<c:forEach begin="1" end="10">
			<button type="button" class="btn item font-sml-text">标签tag</button>
		</c:forEach>
	</div>
</div>