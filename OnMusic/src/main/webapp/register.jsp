<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
<HEAD>
<META http-equiv=Content-Type content="text/html; charset=utf-8">
<META content="MSHTML 6.00.2900.3157" name=GENERATOR>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript">
	function register() {
		// encodeURI() 函数可把字符串作为 URI 进行编码。
		var name = $("#userName").val();
		var pwd = $("#userPwd").val();
		var confirmPwd = $("#confirmPwd").val();

		var user = {
			"name" : name,
			"pwd" : pwd,
			"confirmPwd" : confirmPwd
		};
		var userjson = JSON.stringify(user);

		var transData = "name=John&location=luzou&user=" + userjson;

		$.ajax({
			type : "POST",
			url : "http://localhost:8080/OnMusic/addUser.do",
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
						<TD colspan="2"><div align="center">用户注册</div></TD>
					</TR>
					<TR>
						<TD>&nbsp;</TD>
						<TD>&nbsp;</TD>
					</TR>
					<TR>
						<TD><LABEL>用户名：</LABEL></TD>
						<TD><INPUT type="text" name="userName" id="userName"
							maxlength="16" /></TD>
					</TR>
					<TR>
						<TD><LABEL>用户密码：</LABEL></TD>
						<TD><INPUT type="password" name="userPwd" id="userPwd"
							maxlength="16" /></TD>
					</TR>
					<TR>
						<TD><LABEL>确认密码：</LABEL></TD>
						<TD><INPUT type="password" name="confirmPwd" id="confirmPwd"
							maxlength="16" /></TD>
					</TR>
					<TR align=right>
						<TD colSpan=2>&nbsp;</TD>
					</TR>
					<TR align=right>
						<TD colSpan=2><div align="center">
								<INPUT id=Login type="button" onclick=register() value="注 册">
								&nbsp; <INPUT type="reset" onclick=tb_remove() value="取 消" />
							</div></TD>
					</TR>
				</TBODY>
			</TABLE>
		</form>
	</DIV>
</BODY>
</HTML>
