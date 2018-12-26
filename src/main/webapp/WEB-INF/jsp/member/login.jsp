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
    <title> 로그인 페이지</title>
    <style>
        @import url(//fonts.googleapis.com/earlyaccess/nanumpenscript.css);
        h1{
            font-family: 'Nanum Pen Script', cursive;
        }
        a:link { color: red; text-decoration: none;}
        a:visited { color: black; text-decoration: none;}
        a:hover { color: blue; text-decoration: underline;}

        .input{
            width:200px;
        }
    </style>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css">
</head>

<body>
    <!-- Header -->
    <header id="header">
        <div class="logo"><a href="#">Study <span> Login page</span></a></div>
    </header>
    <section id="main">
        <div class="inner">
            <div class="content">
                <p style="text-align:center"> ID와 PW를 입력해주세요 (사번/사번) </p>
            </div>
                <c:if test="${empty sessionScope.userId }">
                    <form action="loginCheck" id="frm" name="frm" method="post">
                        <table border="1" width="500px" >
                                <input type="text" name="userId" id="userId" placeholder="ID를 입력해주세요">
                                <input type="password" name="userPw" id="userPw" placeholder="비밀번호를 입력해주세요">
                            <tr>
                                <td colspan="2" align="center">
                                    <button type="submit" id="btnLogin"> 로그인 </button>
                                    <c:if test="${msg eq'login'}">
                                        <div style="color:red"> 아이디, 비밀번호를 입력해주세요 </div>
                                    </c:if>
                                    <c:if test="${msg eq 'fail'}">
                                        <div style="color:red"> 아이디 또는 비밀번호가 일치하지 않습니다. </div>
                                    </c:if>
                                    <c:if test="${msg eq 'logout'}">
                                        <div style="color:red"> 로그아웃되었습니다. </div>
                                    </c:if>
                                </td>
                            </tr>
                        </table>
                    </form>
                </c:if>
                <c:if test="${not empty sessionScope.userId }">
                    <p style="text-align:center">${userName}(${userId}, ${userEmail})님이 접속중입니다.
                        <a href="/member/logout">[LOGOUT]</a></p>
                </c:if>

        </div>
    </section>

</body>
</html>

<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script type="text/javascript">
	
	$(document).ready(function(){
		
		var registerCheck = ${needRegister};
		if(registerCheck == true) {
			alert('게시물 등록 전 먼저 로그인을 해주세요.');
		}		
		
		$('#btnLogin').click(function(event){
			var userId = $('#userId').val();
			var userPw = $('#userPw').val();
			
			if(jQuery.trim(userId) == '') {
				alert('ID는 필수입력 정보입니다.');
				$('#userId').focus();
				return;
				
			} else if(userPw == '') {
				alert('PW는 필수입력 정보입니다.');
				$('#userPw').focus();
				return;
			}
		
		});
	});
</script>






