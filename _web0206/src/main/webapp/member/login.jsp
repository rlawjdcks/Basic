<%@ page contentType = "text/html; charset=utf-8" %>
<%@ page import = "util.Cookies" %>
<%
//jsp는 직접실행 안되서 서블릿사용하여 컨테이너에 담겨서 그게 서비스함
//clean으로 초기화
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	
	if (id.equals(password)) {
		// ID와 암호가 같으면 로그인에 성공한 것으로 판단.
		response.addCookie(
			Cookies.createCookie("AUTH", id, "/", -1)
		);
%>
<html>
<head><title>로그인성공</title></head>
<body>

로그인에 성공했습니다.

</body>
</html>
<%
	} else { // 로그인 실패시
%>
<script>
alert("로그인에 실패하였습니다.");
history.go(-1);
</script>
<%
	}
%>
