<%@ page language="java"
	import="java.util.*,com.avicit.onlinemusic.entity.*,com.avicit.onlinemusic.vo.*,java.util.Date,java.text.SimpleDateFormat"
	pageEncoding="UTF-8"%>
<jsp:useBean id="messageVo" class="com.avicit.onlinemusic.vo.MessageVo"
	scope="request" />

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%
	User plutoUser = (User)session.getAttribute("PlutoUser");
 List<MessageVo> mesList= (ArrayList<MessageVo>)request.getAttribute("mesList");
 List<TipVo> tiplist =(ArrayList<TipVo>)request.getAttribute("tiplist");
 List<LinkVo> linklist=(ArrayList<LinkVo>)request.getAttribute("linklist");
%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>OnlineMusic</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/nicejforms.js"></script>
<script type="text/javascript" src="js/thickbox.js"></script>
<link href="css/table.css" rel="stylesheet" type="text/css" />
<link href="css/default.css" rel="stylesheet" type="text/css" />
<link href="css/thickbox.css" rel="stylesheet" type="text/css" />
<style type="text/css" media="screen">
@import url(css/niceforms.css);
</style>
<script type="text/javascript">
	$(document).ready(function() {
		$.NiceJForms.build()

		// 删除消息
		$("#delMes").click(function() {

			var checks = $("input[name='list']");
			var total = checks.length;
			var count = 0;
			for (var i = 0; i < total; i++) {
				if (checks[i].checked == true) {
					count = count + 1;
				}
			}

			if (count == 0) {
				alert('请必须选择至少一条数据');
			} else {
				$("#form2").submit();
			}
		});

	});

	// 全选
	function selectAll(chk) {
		var chk = document.form2.chkAll.checked;
		for (i = 0; i < document.all.length; i++) {
			if (document.all[i].name == "list") {
				document.all[i].checked = chk;
				//chkRow(document.all[i]);
			}
		}
	}
</script>
</head>
<body>
	<div id="header">
		<div id="logo">
			<h1>OnlineMusic</h1>
			<h2></h2>
		</div>
		<div id="menu">
			<ul>
					<li class="active"><a href="index.do" accesskey="1" title="">首页</a>
				</li>
				<li><a href="musicbox.do" accesskey="2" title="">音乐盒</a></li>
				<li><a href="message.do" accesskey="3" title="">短消息</a></li>
				<li><a href="uploadmusicPage.do" accesskey="3" title="">分享歌曲</a></li>
				<li><a href="musicbox.do?listbox=play" accesskey="4" title="">播放列表</a></li>
			</ul>
		</div>
	</div>
	<hr />
	<div id="page">
		<div id="bg">
			<div id="content">
				<div class="post">
					<h2 class="title">我的短消息！</h2>

					<div class="entry">
						<%
							if (mesList.size() > 0) {
								int i = 0;
						%>

						<form method="post" name="form2" id="form2" action="delmessage.do">
							<TABLE width="100%" align="center" class="mytable">
								<THEAD>
									<TR class=odd>
										<TH scope=col>发件人</TH>
										<TH scope=col>时间</TH>
										<TH scope=col>标题</TH>
										<TH scope=col><input type="checkbox" name="chkAll"
											value="" title="全选/取消" onclick="selectAll();" /></TH>
									</TR>
								</THEAD>
								<TFOOT></TFOOT>

								<%
									for (MessageVo mes : mesList) {

											String message_id = Integer.toString(mes.getId());
											String from = mes.getUserFrom();
											String title = mes.getTitle();
											long time = Long.parseLong(mes.getTime());
											Date date = new Date(time);
											SimpleDateFormat sdf = new SimpleDateFormat(
													"yyyy年MM月dd日 HH:mm:ss");
											String message_time = sdf.format(date);
											int isNew = mes.getReadFlg();
											;
											if (i % 2 == 0) {
												out.println("<TBODY><TR>");
											} else {
												out.println("<TBODY><TR class=odd>");
											}
											out.println("<TD>" + from + "</TD>");
											out.println("<TD>" + message_time + "</TD>");
											if (isNew == 1) {
												out.println("<TD><strong><a href=showmessage.do?id="
														+ message_id
														+ "&height=500&width=650 class=\"thickbox\" title=\"查看短消息\"\">"
														+ title + "</a></strong></TD>");
											} else {
												out.println("<TD><a href=showmessage.do?id="
														+ message_id
														+ "&height=500&width=650 class=\"thickbox\" title=\"查看短消息\"\">"
														+ title + "</a></TD>");
											}

											out.println("<TD><input type=\"checkbox\" name=\"list\" id=\"list"
													+ message_id
													+ "\" value=\""
													+ message_id
													+ "\"></TD>");

										}
										out.println("</TBODY></TABLE>");
										out.println("<div align=center>  <input type=\"button\" id=\"delMes\" value=删除选中项>  </div></FORM>");
									} else {
										out.println("对不起，您暂时没有任何短消息！");
									}
								%>
							
					</div>
					<p class="meta"></p>
				</div>
				<div class="post">
					<h2 class="title">发送短消息！</h2>
					<h2 class="title">${error}${success}</h2>
					<div class="entry">
						<%@taglib prefix="sf"
							uri="http://www.springframework.org/tags/form"%>
						<sf:form id="form1" name="form1" method="post"
							action="sendmessage.do" cssClass="niceform"
							commandName="messageVo">

							<label> 收件人： <br /> <sf:input path="userToName" id="textfield" maxlength="16"/>
							</label>
							<br />
							<label> 标 题： <br /> <sf:input path="title" id="textfield" maxlength="16"/>
							</label>
							<br />
							<label> 内容： <input type="hidden" /> <sf:textarea path="value" id="textarea" cols="30" rows="5"/>
							</label>
							<p>
								<br /> <label>
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									<input type="submit" name="button" id="button" value="提交" />
								</label>
							</p>
						</sf:form>
					</div>
					<p class="meta"></p>
				</div>
			</div>
			<!-- end content -->
			<div id="sidebar">
				<div id="about-box" style="font-size: 12px">

					<p>
						<%=plutoUser.getName()%>，欢迎您回来！
					</p>
					<%
						int myMessage = mesList.size();
					%>
					<p>
						您有<%=(myMessage == 0) ? (myMessage)
					: ("<font color=red><strong>" + myMessage + "</strong></font>")%>封未读短消息，请
						<a href="message.do" style="color: red">查看</a>！ <br /> 播放我上次创建的 <a
							href="player" style="color: red">[播放列表]</a>！ <br />
						如果您有音乐分享，您可以点我进行 <a href="uploadmusicPage.do" style="color: red">[上传音乐]</a>！
						<br />
					</p>
					<p>
						退出请点 <a href="logout.do" style="color: #FF0000">[注销登陆]</a>！
					</p>


				</div>
				<ul>
					<li>
						<h2>最新消息</h2>
						<ul>
							<%
								for (TipVo tipV : tiplist) {
									String tip = tipV.getValue();
									out.println("<li>");
									out.println(tip);
									out.println("</li>");
								}
							%>

						</ul>
					</li>
					<li>
						<h2>友情链接</h2>
						<ul>
							<%
								for (LinkVo link : linklist) {
									String link_title = link.getTitle();
									String link_value = link.getValue();
									out.println("<li>");
									out.println("<a href=\"" + link_value + "\">");
									out.println(link_title + "</a>");
									out.println("</li>");
								}
							%>
						</ul>
					</li>
				</ul>
			</div>
			<!-- end sidebar -->
			<div style="clear: both;">&nbsp;</div>
		</div>
	</div>
	<!-- end page -->
	<hr />
	<div id="footer">
		<p>(c) 2008 onlinemusic</p>
	</div>
</body>
</html>

