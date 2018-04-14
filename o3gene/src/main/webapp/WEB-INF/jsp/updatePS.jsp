<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<c:set var="rurl" value="${pageContext.request.scheme}${'://'}${pageContext.request.serverName}${':'}${pageContext.request.serverPort}${pageContext.request.contextPath}"/>
<c:import url="${rurl }/model/global.jsp"></c:import>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改密码-o3gene</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/updatePSs/updatePS" method="post">
<input type="password" name="passWord" placeholder="新密码" />
<input type="submit" value="修改密码">
</form>
</body>
</html>