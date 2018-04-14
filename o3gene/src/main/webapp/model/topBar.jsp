<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="rurl" value="${pageContext.request.scheme}${'://'}${pageContext.request.serverName}${':'}${pageContext.request.serverPort}${pageContext.request.contextPath}"/>
<!-- 顶部导航 -->
<link href="${pageContext.request.contextPath }/css/topBar.css"
	rel="stylesheet">
<script src="${pageContext.request.contextPath }/js/topBar.js"></script>

<!-- 电梯导航 -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/toTop.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/toTop.js"></script>
<div class="header-wrapper">
	<header>
		<div class="container">
			<!-- logo -->
			<div class="logo-container">
				<a href="${rurl}" title="Knowledge Base Theme"> <span
					class="logo"><i><b>o3</b>&nbsp;gene</i></span>
				</a> <span class="tag-line"> <span class="btn-group">
						<button type="button"
							class="btn btn-default dropdown-toggle btn-xs"
							data-toggle="dropdown" data-hover="dropdown"
							style="border: 0px; color: #000; background: none">
							<font color="#fff">语言<span class="caret"></span></font>
						</button>
						<ul class="dropdown-menu" role="menu">
							<li><a href="#">中文</a></li>
							<li><a href="#">中文（繁）</a></li>
							<li><a href="#">蒙文</a></li>
							<li><a href="#">藏文</a></li>
							<li><a href="#">English</a></li>
							<li><a href="#">日文</a></li>
							<li><a href="#">韩文</a></li>
							<li><a href="#">越文</a></li>
							<li><a href="#">泰文</a></li>
							<li><a href="#">缅文</a></li>
						</ul>
				</span>
				</span>
			</div>
			<nav class="main-nav">
				<div class="menu-top-menu-container">
					<ul id="menu-top-menu" class="clearfix">
						<li class="nav-item"><a href="${rurl }">主页</a></li>
						<li class="nav-item"><b><a href="#">商城</a></b>
							<ul class="sub-menu">
								<li><a href="blue-skin.html">Blue Skin</a></li>
								<li><a href="green-skin.html">Green Skin</a></li>
								<li class="current-menu-item"><a href="red-skin.html">Red
										Skin</a></li>
								<li><a href="index-2.html">Default Skin</a></li>
							</ul></li>
						<li class="nav-item"><b><a href="#">论坛</a></b>
							<ul class="sub-menu">
								<li><a href="blue-skin.html">Blue Skin</a></li>
								<li><a href="green-skin.html">Green Skin</a></li>
								<li class="current-menu-item"><a href="red-skin.html">Red
										Skin</a></li>
								<li><a href="index-2.html">Default Skin</a></li>
							</ul></li>
						<c:choose>
							<c:when test="${sessionScope.user!=null }">
								<c:import url="/model/topUserLabel.jsp"></c:import>
							</c:when>
							<c:otherwise>
								<li class="nav-item-reg"><a
							href="${pageContext.request.contextPath }/log.jsp">登录</a><font
							color="#fff">/</font><a
							href="${pageContext.request.contextPath }/reg.jsp">注册</a></li>
							</c:otherwise>
						</c:choose>
					</ul>
				</div>
			</nav>
		</div>
	</header>
</div>
<i id="to-top" class="fa fa-arrow-circle-o-up"></i>
<i id="to-bottom" class="fa fa-arrow-circle-o-down"></i>
