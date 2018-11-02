<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page session="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<c:set var="userId" value="${sessionScope.userId}"/>
<c:set var="userName" value="${sessionScope.userName}" />
<c:set var="userEmail" value="${sessionScope.userEmail}"/>

<a href="/board/listAll"><strong>[게시판]</strong></a>
<a href="/main"><strong>[메인]</strong></a>
<c:choose>
	<c:when test="${empty userId}">
		<a href="/member/login"><strong>로그인</strong></a>
	</c:when>
	<c:otherwise>
		${userName}(${userId}, ${userEmail})님이 접속중입니다.
		<a href="/member/logout"><strong>[로그아웃]</strong></a>
	</c:otherwise>
</c:choose>

<hr>