<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page session="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<c:set var="userId" value="${sessionScope.userId}"/>
<c:set var="userName" value="${sessionScope.userName}"/>
<c:set var="userEmail" value="${sessionScope.userEmail}"/>

<html>
<head>
    <title>MAIN</title>
<style>
@import url(//fonts.googleapis.com/earlyaccess/nanumpenscript.css);
h1{
     font-family: 'Nanum Pen Script', cursive;
}
 a:link { color: red; text-decoration: none;}
 a:visited { color: black; text-decoration: none;}
 a:hover { color: blue; text-decoration: underline;}
</style>
 <meta charset="utf-8" />
 <meta name="viewport" content="width=device-width, initial-scale=1" />
 <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css">
</head>


<body>
	<!-- Header -->
	<header id="header">
		<div class="logo"><a href="/main">Study <span>by JS </span></a></div>
	</header>
	<section id="main">
	<div class="inner">
		<div class="content">
			<c:choose>
				<c:when test="${empty userId}">
				</c:when>
				<c:otherwise>
					<p style="text-align:center">${userName}(${userId}, ${userEmail})님이 접속중입니다.
					<a href="/member/logout">[LOGOUT]</a></p>
				</c:otherwise>
			</c:choose>	
		</div>
	<!-- One -->
		<c:if test="${not empty userId}">
			<section id="one" class="wrapper style1">

				<div class="image fit flush">
					<img src="/resources/images/pic02.jpg" alt="" />
				</div>
				<header class="special">
					<h2>공지사항</h2>
				
					<a href="/board/listAll"><p>공지사항 전체보기</p></a>
				</header>
				<div class="content">
					<p> 이번주 공지</p>
					<p> 이번주 공지</p>
					<p> 이번주 공지</p>
				</div>
			</section>
	
		<!-- Two -->
			<section id="two" class="wrapper style2">
				<header>
					<a href="/study/raffle" onClick="window.open(this.href, '', 'width=600, height=450'); return false;"><h2>사다리 타기</h2></a>
					<p>발표자를 정해봅시다</p>
				</header>
			</section>
	
		<!-- Three -->
			<section id="three" class="wrapper">
				<div class="spotlight">
					<div class="image flush"><img src="/resources/images/pic06.jpg" alt="" /></div>
					<div class="inner">
						<h3>Spring</h3>
						<p>스프링을 공부합시다</p>
					</div>
				</div>
				<div class="spotlight alt">
					<div class="image flush"><img src="/resources/images/pic07.jpg" alt="" /></div>
					<div  class="inner">
						<h3>JavaScript</h3>
						<p>자바스크립트를 공부합시다.</p>	
					</div>
				</div>
				<div class="spotlight">
					<div class="image flush"><img src="/resources/images/pic08.jpg" alt="" /></div>
					<div class="inner">
						<h3>Etc...</h3>
						<p>....</p>
					</div>
				</div>
			</section>
		</c:if>
		<c:if test="${empty userId}">
			<section id="one" class="wrapper style1">
	
				<div class="image fit flush">
					<img src="/resources/images/pic02.jpg" alt="" />
				</div>
				<header class="special">
					<a href="/member/login"><strong><h2>LOGIN</h2></strong></a>
					<p>로그인을 먼저 해주세요.</p>	
				</header>
			</section>					
		</c:if>
	</div>
</section>
		
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
	document.title = "메인 페이지";
</script>
