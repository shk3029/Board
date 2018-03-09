<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>

<%@ include file="/WEB-INF/jsp/layout/topMenu.jsp" %>
<table class="table table-bordered">
	<tr>
		<th style="width: 10px">BNO</th>
		<th> TITLE </th>
		<th> WRITER </th>
		<th> REGDATE</th>
		<th style="width:40px">VIEWCNT</th>
	</tr>
	<c:forEach items="${list}" var="boardVO">
		<tr>
			<td>${boardVO.bno}</td>
			<td><a href='/board/read?bno=${boardVO.bno}'>${boardVO.title}</td>
			<td>${boardVO.writer }</td>
			<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm"
				value="${boardVO.regdate}"/></td>
			<td><span class="badge bg-red">${boardVO.viewcnt}</span>
		</tr>
	</c:forEach>
</table>
<div class="box-booter">
	<button type="submit" class="btn btn-primary">REGISTER</button>
</div>
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script type="text/javascript">
	var result = '${msg}';
	if(result == 'SUCCESS') {
		alert('FINISH');
	}
	
	$('.btn-primary').on("click", function() {
		self.location = "/board/register";
	});
	
	
</script>








