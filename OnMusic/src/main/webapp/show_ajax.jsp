<%@ page language="java"
	import="java.util.*,com.avicit.onlinemusic.entity.*,com.avicit.onlinemusic.vo.*,java.util.Date,java.text.SimpleDateFormat"
	pageEncoding="UTF-8"%>
<jsp:useBean id="userVo" class="com.avicit.onlinemusic.vo.UserVo"
	scope="request" />
<%
	List<Comments> commentlist = (List<Comments>) request
			.getAttribute("listCommnet");
%>
<TABLE width="80%" align="center" class="mytable">

	<%
		if (commentlist != null && commentlist.size() > 0) {
			for (Comments comment : commentlist) {
				String value = comment.getValue();
				String name = comment.getName();
				long time = Long.parseLong(comment.getTime());
				Date date = new Date(time);
				SimpleDateFormat sdf = new SimpleDateFormat(
						"yyyy年MM月dd日 HH:mm:ss");
				String comments_time = sdf.format(date);
	%>
	<TBODY>
		<TR class=odd>
			<TD>
				<div align="left">
					[<%=name%>] 发表于
					<%=comments_time%>
				</div>
			</TD>
		</TR>
	</TBODY>
	<TFOOT></TFOOT>
	<TBODY>
		<TR>
			<TD>
				<div align="left">
					<%=value%>
				</div>
			</TD>
		</TR>
	</TBODY>
	<%
		}
			//out.println("</TABLE>"); 分页
			//out.println("<div class=\"yahoo2\">"+ function.page(maxPage, nowpage, pagesize,"show_ajax.jsp?id=" + id + "") + "</div><br />");
		} else {
	%>
	<TBODY>
		<TR class=odd>
			<TD>
				<div align="left">对不起，暂无任何评论！</div>
			</TD>
		</TR>
	</TBODY>
</TABLE>
<%
	}
%>

