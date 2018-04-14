<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="rurl"
	value="${pageContext.request.scheme}${'://'}${pageContext.request.serverName}${':'}${pageContext.request.serverPort}${pageContext.request.contextPath}" />

<!-- 商品面板2-->
<link href="${pageContext.request.contextPath }/css/goodsLabel2.css"
	rel="stylesheet">

<!-- <script src="${pageContext.request.contextPath }/js/goodsLabel2.js"></script> -->

<div id="goodsLabel2">
	<div>
		<a href="#"><h3 class="sys-font weight-color">美家摄像馆</h3></a>
		<p><span class="labelDesc font-sml-text deep-gray-color">爱生活有内涵</span></p>
		<span class="more"><a class="color-gray-deep font-sml-text" href="">更多 <i class="fa fa-angle-right"></i></a></span>
		<span class="clearBoth"></span>
	</div>
	<div class="goodsesBox">
		<div class="left">
			<div class="leftOne">
				<div style="height: 302px; width: 245px"><img class="autoImg" alt="" src="${pageContext.request.contextPath }/img/test1.png"></div>
			</div>
			<div class="leftTwo">
				<div>
					<div class="font-big sys-font">极有家</div>
					<div class="font-sml-text sys-font deep-gray-color">过我想过的生活</div>
				</div>
				<div>
					<div style="width:121px;height:90px;"><img class="autoImg" alt="abc" src="${pageContext.request.contextPath }/img/test2.webp"></div>
				</div>
			</div>
		</div>
		<div class="right">
			<div class="goodsBox">
				<div class="title">
					<span class="font-big sys-font">亲宝贝</span>
					<span class="font-sml-text sys-font deep-gray-color">享受育儿新方式</span>
				</div>
				<div class="imgBox">
					<div>
						<div><img class="autoImg" alt="" src="${pageContext.request.contextPath }/img/test3.webp"></div>
					</div>
					<div>
						<div><img class="autoImg" alt="" src="${pageContext.request.contextPath }/img/test4.webp"></div>
					</div>
				</div>
			</div>
			<div class="goodsBox">
				<div class="title">
					<span class="font-big sys-font">亲宝贝</span>
					<span class="font-sml-text sys-font deep-gray-color">享受育儿新方式</span>
				</div>
				<div class="imgBox">
					<div>
						<div><img class="autoImg" alt="" src="${pageContext.request.contextPath }/img/test5.webp"></div>
					</div>
					<div>
						<div><img class="autoImg" alt="" src="${pageContext.request.contextPath }/img/test6.webp"></div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>