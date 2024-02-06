<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!--  onclick로 script의 메서드를 사용 -->
	<button onclick="test()">클릭</button>
	<h1 id="title">hi jsp1</h1>
	<h1 class="title2">hi jsp2</h1>
	<script>
		function test() {
			//콘솔에 값 출력 이건 고전스타일
			let str1 = document.getElementById("title");
			//현대스타일
			let str2 = document.querySelector("#title");
			let str3 = document.querySelector(".title2");
			console.log("hi", 'gfgf', str1, str2, str3);
			str3.innerHTML = "테스트";
		}
	</script>
</body>
</html>