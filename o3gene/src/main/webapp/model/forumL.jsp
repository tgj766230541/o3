<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="rurl"
	value="${pageContext.request.scheme}${'://'}${pageContext.request.serverName}${':'}${pageContext.request.serverPort}${pageContext.request.contextPath}" />

<!-- 精品帖子面板-->
<link href="${pageContext.request.contextPath }/css/forumL.css"
	rel="stylesheet">
<script src="${pageContext.request.contextPath }/js/forumL.js"></script>

<div class="forumL">
	<div class="flTop">精品帖子</div>
	<div>
		<ul>
			<c:forEach begin="1" end="6">
				<li>
					<div class="flTitle">
						<i class="fa fa-file-text-o deep-gray-color" aria-hidden="true"></i>&nbsp;
						<h4><a class="color-base" href="#">这是标题</a></h4>
					</div>
					<div class="flDesc">
						<div>
							<div class="flTag">
								<span  class="deep-gray-color font-desc">2016-12-18</span>
								<span><a class="dot-font font-desc" href="#">标签1</a><a class="dot-font font-desc" href="#">标签2</a></span>
							</div>
						</div>
						<div class="flLike">
							<i class="fa fa-thumbs-up" aria-hidden="true"></i>
							<span>66</span>
						</div>
						<span class="clearBoth"></span>
					</div>
				</li>
			</c:forEach>

		</ul>
	</div>
</div>