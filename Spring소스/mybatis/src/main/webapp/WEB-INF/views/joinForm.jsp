<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
/* drag & drop */
.drag-over {
	background: yellow;
}

.thumb {
	width: 100px;
	padding: 2px;
	float: left;
}

.thumb>img {
	width: 100%;
}

.thumb>.close {
	position: absolute;
	background: red;
	cursor: pointer;
}

#drop {
	border: 1px solid black;
	width: 300px;
	height: 200px;
	padding: 3px;
}
</style>
<script type="text/javascript">
	function idChk() {
		if (!frm.id.value) {
			alert("아이디 입력한 후에 체크 하시오");
			frm.id.focus();
			return false;
		}
		$.post("idChk.do", "id=" + frm.id.value, function(data) {
			$('#idChk1').html(data);
		})
	}
	function chk() {
		if (frm.password.value != frm.password2.value) {
			alert("암호가 확인과 다릅니다");
			frm.password.focus();
			frm.password.value = "";
			frm.password2.value = "";
			return false;
		}
	}
	// drag & drop
	$(document).on(
			"drop",
			function(e) {
				// 태그에 파일 넣기
				$('input[type="file"]').prop("files",
						e.originalEvent.dataTransfer.files);
			});
	$(function() {
		let uploadfiles = []; // 파일 배열(여러개 파일도 사용)
		let $drop = $('#drop');
		$drop.on("dragenter", function() { // 드래그 요소가 들어 왔을 때
			$('#thumbnails').text("");
			$(this).addClass('drag-over');
		}).on("dragleave", function() { // 드래그 요소가 나갔을 때
			$('#thumbnails').text("그림을 올려 놓으세요");
			$(this).removeClass('drag-over');
		}).on("dragover", function(e) { // 드래그 한 그림을 떨어뜨리기 위해 위에 올려 놨을 때
			e.stopPropagation(); // 이벤트를 전달하지 마라
			e.preventDefault(); // 원래 자체 기느을 하지 마라
		}).on("drop", function(e) { // 드래그 한 그림을 떨어 뜨렸을 떄
			e.preventDefault();
			$(this).removeClass('drag-over');
			let files = e.originalEvent.dataTransfer.files; // 드래그한 그림들
			for (let i = 0; i < files.length; i++) {
				let file = files[i];
				let size = uploadfiles.push(file); // 업로드 파일 목록에 추가
				preview(file); // 미리 보기
			}
		});
		$('#thumbnails').on('click', function(e) {
			let $target = $(e.target);
			let idx = $target.attr('data-idx');
			$target.parent().remove(); // x를 클릭한 그림 삭제
		});
	});
	// 그림 보여주기
	function preview(file) {
		var reader = new FileReader();
		reader.onload = (function(f) {
			return function(e) {
				var div = '<div class="thumb"><div class="close">X</div><img src="'+
					e.target.result+'"/></div>';
				$('#thumbnails').append(div);
			};
		})(file);
		reader.readAsDataURL(file);
		// readAsDataURL: 컨텐츠의 특정 Blob이나 File에서 읽어노는 역할 수행
	}
</script>
</head>
<body>
	<div class="container" align="center">
		<h2 class="text-primary">회원가입</h2>
		<form action="join.do" method="post" enctype="multipart/form-data"
			name="frm" onsubmit="return chk()">
			<table class="table table-bordered">
				<tr>
					<th>아이디 <i class="bi bi-file-earmark-person icofont-2x"></i></th>
					<td><input type="text" name="id" required="required"
						class="form-control" autofocus="autofocus"> <input
						type="button" class="btn btn-warning btn-sm" onclick="idChk()"
						value="중복체크"> <span id="idChk1" class="err"></span></td>
				</tr>
				<tr>
					<th>암호 <i class="bi bi-file-lock2 icofont-2x"></i></th>
					<td><input type="password" name="password" required="required"
						class="form-control"></td>
				</tr>
				<tr>
					<th>암호확인 <i class="bi bi-file-lock2 icofont-2x"></i></th>
					<td><input type="password" name="password2"
						required="required" class="form-control"></td>
				</tr>
				<tr>
					<th>이름 <i class="bi bi-person-vcard icofont-2x"></i></th>
					<td><input type="text" name="name" required="required"
						class="form-control"></td>
				</tr>
				<tr>
					<th>이메일 <i class="bi bi-envelope icofont-2x"></i></th>
					<td><input type="email" name="email" required="required"
						class="form-control"></td>
				</tr>
				<tr>
					<th>사진<i class="bi bi-file-earmark-person icofont-2x"></i></th>
					<td><input type="file" name="file" class="form-control"
						required="required"></td>
				</tr>
				<!-- drag & drop -->
				<tr>
					<th>사진 <i class="bi bi-file-earmark-person icofont-2x"></i></th>
					<td><div id="drop">
							<div id="thumbnails">그림을 올려 놓으세요</div>
						</div></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="회원가입" class="btn btn-success"></td>
				</tr>
			</table>
		</form>
		<a href="loginForm.do" class="btn btn-info">로그인</a>
	</div>
</body>
</html>