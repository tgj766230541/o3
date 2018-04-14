<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="rurl" value="${pageContext.request.scheme}${'://'}${pageContext.request.serverName}${':'}${pageContext.request.serverPort}${pageContext.request.contextPath}"/>

<link href="${pageContext.request.contextPath }/css/topUserLabel.css" rel="stylesheet">
<script src="${pageContext.request.contextPath }/js/topUserLabel.js"></script>

<li class="nav-item-click"><a href="#"> <span id="userImg"><div><img class="small-user-img" alt="头像" src="${pageContext.request.contextPath }/images/${sessionScope.user.headIcon }"></span><span class="user-hint-img"></div></span><span>糖果</span>
</a>
	<ul id="user-label" class="sub-menu user_box" onclick="cancelClick(event);">
		<li>
			<div class="user-item-top">
				<div class="big-user-img"><div><img alt="头像" src="${pageContext.request.contextPath }/images/${sessionScope.user.headIcon }"></div></div>
			</div>
			<div class="user-item-up">
				<div>
					<font color="#fff"><b><font color="#FFD700"><i>vip&nbsp;0</i></font>&nbsp;&nbsp;&nbsp;&nbsp;${sessionScope.user.nickName }</b></font>&nbsp;&nbsp;<font
						size="1">${sessionScope.user.intro }</font>
				</div>
			</div>
			<div class="user-item-down">
				<table>
					<tr>
						<td><a href="#"><i class="fa fa-shopping-cart user-fa"
								style="font-size: 13px; color: #D87C77"></i><span
								class="user-hint user-hint-cart"><span>1</span></span>&nbsp;购物车</a></td>
						<td><a href="#"><i class="fa fa-first-order user-fa"
								style="font-size: 13px; color: #D87C77"></i><span
								class="user-hint-noNum"></span>&nbsp;订单</a></td>
						<td><a href="#"><i class="fa fa-bell user-fa"
								style="font-size: 13px; color: #D87C77"></i><span
								class="user-hint"><span>2</span></span>&nbsp;提醒</a></td>
						<td><a href="#"><i class="fa fa-comment user-fa" aria-hidden="true" 
								style="font-size: 13px; color: #D87C77"></i><span
								class="user-hint"><span>3</span></span>&nbsp;消息</a></td>
					</tr>
				</table>
			</div>
			<div class="user-item-bottom">
				<table>
					<tr>
						<td><a href="${pageContext.request.contextPath }/topBar/enterPersonal">个人中心</a></td>
						<td><a href="${pageContext.request.contextPath }/exits/exit">退出</a></td>
					</tr>
				</table>
			</div>
		</li>
	</ul>
</li>