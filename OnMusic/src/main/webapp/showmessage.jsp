<%@ page language="java"
	import="com.avicit.onlinemusic.entity.*,java.util.*"
	pageEncoding="UTF-8"%>
<%
	Message message = (Message) request.getAttribute("message");
%>
<script type="text/javascript" src="js/audioplayer.js"></script>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>查看短消息</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link href="css/table.css" rel="stylesheet" type="text/css" />
<link href="css/default.css" rel="stylesheet" type="text/css" />

</head>

<body>

	<%
		String title = message.getTitle();
		String value = message.getValue();
	%>
	<TABLE width="80%" align="center" class="mytable">
		<THEAD>
			<TR class=odd>
				<TH scope=col><%=title%></TH>
			</TR>
		</THEAD>
		<TFOOT></TFOOT>
		<TBODY>
			<TR>
				<td><%=value%></td>
			</TR>
		</tbody>
</body>
</html>

