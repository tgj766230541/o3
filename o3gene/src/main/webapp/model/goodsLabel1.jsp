<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="rurl"
	value="${pageContext.request.scheme}${'://'}${pageContext.request.serverName}${':'}${pageContext.request.serverPort}${pageContext.request.contextPath}" />

<!-- 商品面板1-->
<link href="${pageContext.request.contextPath }/css/goodsLabel1.css"
	rel="stylesheet">
<script src="${pageContext.request.contextPath }/js/goodsLabel1.js"></script>

<div id="goodsLabel1">
	<div>
		<a href="#"><h3 class="sys-font weight-color">生活品质家</h3></a>
		<p><span class="labelDesc font-sml-text deep-gray-color">发现深藏的好店</span></p>
		<span class="more"><a class="color-gray-deep font-sml-text" href="">更多 <i class="fa fa-angle-right"></i></a></span>
		<span class="clearBoth"></span>
	</div>
	
	<ul>
	
		<c:forEach begin="1" end="4">
			<li class="goodsBox">
			<a href="">
				<h4 class="goodsTitle">
					<span class="color-gray">今日推荐</span> <span class=" font-sml-text deep-gray-color">暂无店铺评价</span>
				</h4>
				<div>
					<div class="goodsImgOne">
						<img class="autoImg" src="${pageContext.request.contextPath }/img/wurenji.jpg" alt="">
					</div>
					<div class="imgRight">
						<div class="goodsImgTwo">
							<img class="autoImg" src="${pageContext.request.contextPath }/img/wurenji.jpg" alt="">
						</div>
						<div class="goodsImgTwo">
							<img class="autoImg" src="${pageContext.request.contextPath }/img/wurenji.jpg" alt="">
						</div>
					</div>
				</div>
			</a>
		</li>
		</c:forEach>
		
	</ul>
</div>