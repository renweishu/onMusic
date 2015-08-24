<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%
	String rd_id = request.getParameter("id");
%>
<HTML>
<HEAD>
<META http-equiv=Content-Type content="text/html; charset=utf-8">
<META content="MSHTML 6.00.2900.3157" name=GENERATOR>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript">
	function ktvMusic() {

		// encodeURI() 函数可把字符串作为 URI 进行编码。
		var toUser = $("#toUser").val();
		var musicId = $("#musicId").val();
		// 0-默认不匿名点歌 1-匿名点歌
		var hidename = 0;
		// 勾选代表匿名点歌
		if ($("#checkbox").attr("checked") == true) {
			hidename = 1;
		}
		var textarea = $("#textarea").val();

		var ktvmessage = {
			"toUser" : toUser,
			"musicId" : musicId,
			"hidename" : hidename,
			"textarea" : textarea
		};
		var messagejson = JSON.stringify(ktvmessage);


		var transData = "name=John&location=luzou&messagejson=" + messagejson;

		$.ajax({
			type : "POST",
			url : "http://localhost:8080/OnMusic/ktvMusicMessage.do",
			dataType : "json",
			data : transData,
			error : function() {
				alert("服务端繁忙，响应缓慢....请稍等");
			},
			success : function(data) {
				var v = JSON.stringify(data);
				var t = JSON.parse(v);
				// 注册失败
				if (t.text == 'registerError') {
					alert(t.extra);
				} else {
					alert(t.text);
					// 关闭窗口
					tb_remove();
				}

			}
		});

	}
</script>
</HEAD>
<BODY>
	<DIV style="TEXT-ALIGN: center">
		<form action="#" method="post">
			<TABLE style="MARGIN: 0px auto" cellSpacing=3 cellPadding=3 border=0>
				<TBODY>
					<TR>
						<TD colspan="2">

							<div align="center">点播歌曲:</div>
						</TD>
					</TR>
					<TR>
						<TD width="85">&nbsp;</TD>
						<TD width="332">&nbsp;</TD>
					</TR>
					<TR>
						<TD><LABEL> 用户名： </LABEL></TD>
						<TD>
							<div align="left">
								<INPUT type="text" name="toUser" id="toUser" maxlength="16" />
								<INPUT type="hidden" name="musicId" id="musicId"
									value='<%=rd_id%>' />
							</div>
						</TD>
					</TR>
					<TR>
						<TD><br></TD>
						<TD>
							<div align="left">
								<label> <input type="checkbox" name="hidename"
									id="checkbox"> 匿名点歌
								</label>
							</div>
						</TD>
					</TR>
					<TR>
						<TD><LABEL> 留言： </LABEL></TD>
						<TD><label>
								<div align="left">
									<textarea name="value" id="textarea" cols="45" rows="5"></textarea>
								</div>
						</label></TD>
					</TR>
					<TR>
						<TD><br></TD>
						<TD><br></TD>
					</TR>
					<TR align=right>
						<TD colSpan=2>
							<div align="center">
								<INPUT id=Login type="button" onclick=ktvMusic() value="确 定">
								&nbsp; <INPUT type="reset" onclick=tb_remove() value="取 消" />
							</div>
						</TD>
					</TR>
				</TBODY>
			</TABLE>
		</form>
	</DIV>
</BODY>
</HTML>
