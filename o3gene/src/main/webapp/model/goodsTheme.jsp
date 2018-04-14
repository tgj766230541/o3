<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="rurl"
	value="${pageContext.request.scheme}${'://'}${pageContext.request.serverName}${':'}${pageContext.request.serverPort}${pageContext.request.contextPath}" />

<!-- 商品专题栏 -->
<link href="${pageContext.request.contextPath }/css/goodsTheme.css"
	rel="stylesheet">
<script src="${pageContext.request.contextPath }/js/goodsTheme.js"></script>
<div id="goodsesThemeBox">
	<div class="goodsesThemeTitle sys-font weight-color">
		<h3>无人机专题</h3>
	</div>
	
	<c:forEach begin="1" end="4">
		<div class="goodsThemeBox weight-color">
			<a href="#">
				<div><img alt="" src="${pageContext.request.contextPath }/img/wurenji.jpg" /></div>
				<div class="themeDescBox">
					<div class="themeTitle">
						<b>新品专区</b>
					</div>
					<div class="themeDesc font-mid-text">探访源头产地 臻选当令时鲜</div>
				</div>
			</a>
		</div>
	</c:forEach>

</div>