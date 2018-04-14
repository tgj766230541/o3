<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<c:set var="rurl"
	value="${pageContext.request.scheme}${'://'}${pageContext.request.serverName}${':'}${pageContext.request.serverPort}${pageContext.request.contextPath}" />
<c:import url="${rurl }/model/global.jsp"></c:import>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>o3gene</title>
<link href="${pageContext.request.contextPath }/page_css/index.css"
	rel="stylesheet">
</head>
<body>
	<!-- 顶部导航 -->
	<c:import url="/model/topBar.jsp"></c:import>
	<!-- banner -->
		<c:import url="/model/banner.jsp"></c:import>
	<!-- 主体 -->
	<div class="main">
		<div class="content" style="height: 3000px">
			<!-- 主题商品 -->
			<div class="item-box mod-box">
				<c:import url="/model/goodsTheme.jsp"></c:import>
			</div>
			<table class="item-box">
				<tr>
					<td width="578">
						<!-- 推荐商品1 -->
						<div class="mod-box-color"><c:import url="model/goodsLabel2.jsp"></c:import></div>
					</td>
					<td  width="578">
						<!-- 推荐商品2 -->
						<div class="mod-box-color"><c:import url="model/goodsLabel1.jsp"></c:import></div>
					</td>
				</tr>
			</table>
			<table class="item-box">
				<tr>
					<td width="32%">
						<!-- 推荐帖子 -->
						<div><c:import url="model/forumL.jsp"></c:import></div>
					</td>
					<td  width="32%>
						<!-- 最新帖子 -->
						<div><c:import url="model/forumL.jsp"></c:import></div>
					</td">
					<td  width="32%">
						<!-- 客服支持 -->
						<div class="mod-box-color">1</div>
						<!-- 快捷导航 -->
						<div class="mod-box-color">1</div>
						<!-- 标签搜索 -->
						<div class="mod-box-color">1</div>
					</td>
				</tr>
			</table>
		</div>
	</div>
	<!-- 底部导航 -->
	<div class="mod-box">1</div>
	<!-- 商标信息 -->
	<div class="mod-box">1</div>
</body>