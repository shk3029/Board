<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="true" %>
<c:set var="userId" value="${sessionScope.userId}"/>
<c:set var="userName" value="${sessionScope.userName}" />
<c:set var="userEmail" value="${sessionScope.userEmail}"/>

<%@ include file="/WEB-INF/jsp/layout/topMenu.jsp" %>
<h1> 글 작성하기 </h1>
	<form role="form" method="post">
		<div class="box-body">
		  <div class="form-group">
			<label for="exampleInputEmail1"> 제목 </label>
			<input type="text"
				   name='title' size="80" placeholder="제목을 입력해주세요.">
		 </div>
		 <br>
		 <div class="form-group">
		 	<label for="exampleInputPassword1"> 내용 </label>
		 	<textarea name="content" rows="4" cols="80"
		 				placeholder="내용을 적어주세요."></textarea>
		 </div>
		 <br>
		 <div class="form-group">
		 	<label for="exampleInputEamil1"> 작성자 </label>	
		 	<input type="text"
		 		 	name="writer" class="form-control" placeholder="Enter Writer"  value="${userName}" readonly style="background-color: #e2e2e2;">
		 </div>
		</div>
		<!-- / box - body -->
		<br>
		<div class="box-footer">
			<button type="submit" class="btn btn-primary">SUBMIT</button>
			<button type="button" class="btn btn-danger">CANCEL</button>
		</div>
	</form>
	
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script type="text/javascript">

	$('.btn-danger').on("click", function(){
		self.location="/board/listAll";
	});

	document.title = "게시판 글쓰기";
</script>
