<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page session="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<c:set var="userId" value="${sessionScope.userId}"/>
<c:set var="userName" value="${sessionScope.userName}"/>

<%@ include file="/WEB-INF/jsp/layout/topMenu.jsp" %>

<html>
<head>
    <title>MAIN</title>
</head>
<body>
<h2> JS Main 페이지입니다. </h2>
<c:if test="${not empty userId}">
${sessionScope.userName}(id: ${sessionScope.userId })님 안녕하세요! 아직은 게시판 기능만 존재합니다!
<h1> <a href="/board/listAll">게시판으로 바로가기</a></h1>
</c:if>

<c:if test="${empty userId}">
<h1> 먼저 <a href="/member/login">로그인</a>을 해주세요. </h1>

</c:if>
</body>
</html>


<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script type="text/javascript">
// 이처럼 하면 세션이 날라감 
/* 	$(document).ready(function(){
		$('#board').click(function(event){
				location.href = '/board/listAll';
		});
	}); */
</script>
