<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LOGIN</title>
</head>
<body>

<form action="/guestbook3/gb" method="get">
<input type="hidden" name="a" value="login">

<table border='1px' cellspacing='1' cellpadding='2px'>
<tr>
<td>ID</td><td><input type="text" name="id">
</td>
</tr>
<tr>
<td>비밀번호</td><td> <input type="password" name="password"></td>
</tr>

<tr>
<td colspan="2" align=right>
<input type="submit" value="로그인">
</td>
</tr>



</table>


</form>

<%


%>
</body>
</html>