<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link href="assets/css/bootstrap.min.css" rel="stylesheet">
<ul>
	<input type = "hidden" name = "name" value = "${session}">
	<c:choose>
		<c:when test="${not empty session}">
			<li class="selected">${session}님</li>
		</c:when>
		<c:otherwise>
			<li class="selected">GUEST님</li>
		</c:otherwise>
	</c:choose>
	<li><a href="guest?a=guestbookform">방명록</a></li>
	<li><a href="${contextPath}/mysite/bulletin?a=bulletinMain">게시판</a></li>
</ul>