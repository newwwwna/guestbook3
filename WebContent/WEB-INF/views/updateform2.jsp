<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UPDATE</title>
</head>
<body>
<%String no = request.getParameter("no");%>
<%String name = request.getParameter("name");%>
<%String password = request.getParameter("password");%>
<%String content = (String) request.getParameter("content");%>

<form action="/guestbook3/gb" method="post">
<input type="hidden" name="no" value="<%= no %>">
<input type="hidden" name="a" value="update">


	<table border='1px' cellspacing='1' cellpadding='2px'>
		<tr>
			<td> 이름 </td> <td><input type="text" name="name2" value="<%=name%>"></td>
			<td> 비밀번호 </td> <td><input type = "text" name="pw" value="<%=password%>"></td>
		</tr>
		<tr>
			<td colspan="4">
			<textarea name = "content2" rows="10" cols="50"><%=content %></textarea>	
			
			</td>
		</tr>
		<tr>
			<td colspan="4" align=right>
			<input type="submit" value="수정">
			
		</td>
		</tr>
	</table> <br/>
</form>

<%


%>
</body>
</html>