<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="true" %>

<%@ include file="/WEB-INF/jsp/layout/topMenu.jsp" %>
<form role="form" method="post">
	<input type='hidden' name='bno' value="${boardVO.bno}">
</form>

<div class="box-body">
	<div class="form-group">
		<label for="exampleInputEmail1">Title</label>
		<!-- readonly 속성을 이용해 사용자가 내용을 수정할 수 없도록 만들어줌 -->
		<input type="text" name="title" class="form-control" value="${boardVO.title}" readonly="readonly">
	</div>
	<div class="form-group">
		<label for="exampleInputPassword1">Content</label>
		<texterea class="form-control" name="content" rows="3" readonly='readonly'> ${boardVO.content}</texterea>
	</div>
	<div class='form-group'>
		<label for="exampleInputEmail1">Writer</label>
		<input type="text" name="writer" class="form-control" value="${boardVO.writer}" readonly="readonly" style="background-color: #e2e2e2;">
	</div>
</div>

<div class="box-footer">
	<button type="submit" class="btn btn-warning">Modify</button>
	<button type="submit" class="btn btn-danger">REMOVE</button>
	<button type="submit" class="btn btn-primary">LIST ALL</button>
</div>
<!-- 제이쿼리를 이용해서 변경된 화면의 버튼 처리 -->
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script type="text/javascript">
	var formObj = $("form[role='form']");
	console.log(formObj);
	
	$('.btn-warning').on("click", function(){
		formObj.attr('action', "/board/modify");
		formObj.attr('method', 'get');
		formObj.submit();
	});

	$('.btn-danger').on("click", function(){
		formObj.attr('action', "/board/remove");
		formObj.submit();
	});
	
	$('.btn-primary').on("click", function(){
		self.location="/board/listAll";
	});
	
</script>

































