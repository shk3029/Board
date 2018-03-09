<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="true" %>
<c:set var="userId" value="${sessionScope.userId}"/>
<c:set var="userName" value="${sessionScope.userName}" />

<%@ include file="/WEB-INF/jsp/layout/topMenu.jsp" %>

	<form role="form" method="post">
		<div class="box-body">
		  <div class="form-group">
			<label for="exampleInputEmail1">Title</label>
			<input type="text"
				   name='title' class="form-control" placeholder="Enter Title">
		 </div>
		 <div class="form-group">
		 	<label for="exampleInputPassword1">Content</label>
		 	<textarea class="form-control" name="content" rows="3"
		 				placeholder="Enter ..."></textarea>
		 </div>
		 <div class="form-group">
		 	<label for="exampleInputEamil1">Writer</label>	
		 	<input type="text"
		 		 	name="writer" class="form-control" placeholder="Enter Writer"  value="${userName}" readonly style="background-color: #e2e2e2;">
		 </div>
		</div>
		<!-- / box - body -->
		
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

</script>
