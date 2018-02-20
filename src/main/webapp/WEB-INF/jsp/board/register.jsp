<%@ include file="../include/header.jsp" %>
	<!--  form의 속성이 post로 지정된 것과 action이 지정되지 않았다는 것을 주목 -->
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
		 		 	name="writer" class="form-control" placeholder="Enter Writer">
		 </div>
		</div>
		<!-- / box - body -->
		
		<div class="box-footer">
			<button type="submit" class="btn btn-primary">SUBMIT</button>
			<button type="button" class="btn btn-danger">CANCEL</button>
		</div>
	</form>
	
<%@ include file="../include/footer.jsp" %>

<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script type="text/javascript">

	$('.btn-danger').on("click", function(){
		self.location="/board/listAll";
	});

</script>
