<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="true" %>

<%@ include file="/WEB-INF/jsp/layout/topMenu.jsp" %>

<h1> 게시판 </h1>
<form name="form" method="post">
	<select name="searchOption">
		<option value="all" <c:if test="${searchOption == 'all'}">selected="selected"</c:if>>전체</option>
		<option value="writer" <c:if test="${searchOption == 'writer'}">selected="selected"</c:if>> 작성자 </option>
		<option value="content" <c:if test="${searchOption == 'content'}">selected="selected"</c:if>> 내용 </option>
		<option value="title" <c:if test="${searchOption == 'title'}">selected="selected"</c:if>> 제목 </option>
	</select>
	<input name="keyword" value="${keyword}">
	<input type="submit" class="search-title" value="조회">
	<br>
	<button type="submit" class="btn btn-primary"> 새글 작성하기</button>
</form>
<br>

<table border="1", width="600px">
	<tr>
		<th> 번호 </th>
		<th> 제목  </th>
		<th> 작성자  </th>
		<th> 작성일 </th>
		<th> 조회수 </th>
	</tr>
	<c:forEach items="${list}" var="boardVO">
		<tr>
			<td>${boardVO.bno}</td>
			<td><a href='/board/read?bno=${boardVO.bno}'>${boardVO.title}</a></td>
			<td>${boardVO.writer }</td>
			<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm"
				value="${boardVO.regdate}"/></td>
			<td>${boardVO.viewcnt}</td>
		</tr>
	</c:forEach>
</table>
<br>

<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script type="text/javascript">
	var result = '${msg}';
	if(result == 'SUCCESS') {
		alert('FINISH');
	}
	
	$('.btn-primary').on("click", function() {
		self.location = "/board/register";
	});
	
	document.title = "게시판 목록";

</script>








