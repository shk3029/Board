<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page session="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<c:set var="userId" value="${sessionScope.userId}"/>
<c:set var="userName" value="${sessionScope.userName}" />

<a href="/board/listAll">게시판</a>
<c:choose>
	<c:when test="${empty userId}">
		<a href="/member/login">로그인</a>
	</c:when>
	<c:otherwise>
		${userName} 님이 접속중입니다.
		<a href="/member/logout">로그아웃</a>
	</c:otherwise>
</c:choose>

<hr>