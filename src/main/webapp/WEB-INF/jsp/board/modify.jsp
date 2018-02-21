<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>
<form role="form" method="post">

	<div class="box-body">
		<div class="form-group">
			<label for="exampleInputEmail1">BNO</label>
			<input type="text" name="bno" class="form-control" value="${boardVO.bno}" readonly="readonly">
		</div>
		<div class="form-group">
			<label for="exampleInputEmail1">Title</label>
			<input type="text" name="title" class="form-control" value="${boardVO.title}" >
		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">Content</label>
			<textarea class="form-control" name="content" rows="3" > ${boardVO.content}</textarea>
		</div>
		<div class='form-group'>
			<label for="exampleInputEmail1">Writer</label>
			<input type="text" name="writer" class="form-control" value="${boardVO.writer}" >
		</div>
	</div>
	
</form>


<div class="box-footer">
	<button type="submit" class="btn btn-warning">CANCEL</button>
	<button type="submit" class="btn btn-primary">SAVE</button>
</div>

<!-- 제이쿼리를 이용해서 변경된 화면의 버튼 처리 -->
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script type="text/javascript">
	var formObj = $("form[role='form']");
	console.log(formObj);
	
	$('.btn-warning').on("click", function(){
		self.location="/board/listAll";
	});

	$('.btn-primary').on("click", function(){
		formObj.submit();
	});
	
</script>


