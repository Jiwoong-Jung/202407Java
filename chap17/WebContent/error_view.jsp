<%@ page contentType="text/html; charset=euc-kr" %>
<%@ page isErrorPage="true" %>
<html>
<head><title>에러 발생</title></head>
<body>
프로그램 실행 도중 예기치 못한 에러가 발생하였습니다.
<br/><br/>
에러가 지속될 경우 사이트 관리자에게 문의해주시기 바랍니다. 
</body>
</html>
<%
	exception.printStackTrace();
%>
<!--
프로그램 실행 도중 예기치 못한 에러가 발생했을 때 출력되는 화면.
에러에 대한 상세한 내역은 콘솔에 출력된 로그를 확인 필요함.
이 주석은 인터넷 익스플로러에서 이 에러 화면이 올바르게 출력될 수
있도록 하기 위해 추가된 내용임
이 주석이 없을 경우 에러 메시지가 출력되지 않을 수 있음
-->