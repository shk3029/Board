<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2> Login ������  ${msg } </h2>
		<form name="form" method="post">
			<table border="1" width="700px">
				<tr>
					<td> ID </td>
					<td> <input name="userId" id="userId"></td>
				</tr>
				<tr>
					<td> ��й�ȣ </td>
					<td> <input type="password" name="userPw" id="userPw"></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<button type="button" id="btnLogin"> �α��� </button>
						<c:if test="${msg eq'login'}">
							<div style="color:red"> ���̵�, ��й�ȣ�� �Է����ּ��� </div>
						</c:if>
						<c:if test="${msg eq 'fail'}">
							
							<div style="color:red"> ���̵� �Ǵ� ��й�ȣ�� ��ġ���� �ʽ��ϴ�. </div>
						</c:if>
						<c:if test="${msg eq 'logout'}">
							<div style="color:red"> �α׾ƿ��Ǿ����ϴ�. </div>
						</c:if>
					</td>
				</tr>
			</table>
		</form>
</body>
</html>