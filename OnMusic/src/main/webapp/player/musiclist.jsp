<%@ page language="java"
	import="java.util.*,java.io.File,com.avicit.onlinemusic.entity.*,com.avicit.onlinemusic.vo.*"
	pageEncoding="UTF-8"%>
<jsp:useBean id="userVo" class="com.avicit.onlinemusic.vo.UserVo"
	scope="request" />
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%
	User plutoUser = (User) session.getAttribute("PlutoUser");
	List<MessageVo> mesList = (ArrayList<MessageVo>) request
			.getAttribute("mesList");
	List<TipVo> tiplist = (ArrayList<TipVo>) request
			.getAttribute("tiplist");
	List<LinkVo> linklist = (ArrayList<LinkVo>) request
			.getAttribute("linklist");

	String user_id = Integer.toString(plutoUser.getId());
	String path = request.getSession().getServletContext()
			.getRealPath("player/xml/");
	File f = new File(path, user_id + ".xml");
	if (!f.exists()) {
		String message = "<script language='javascript'>alert('抱歉你从未创建过播放列表');location.href='index.do';</script>";
		out.println(message);
	}
%>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Pluto Music 80.f</title>
<meta name="keywords" content="" />
<meta name="description" content="" />

<link href="css/default.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<div id="header">
		<div id="logo">
			<h1>Pluto Music</h1>
			<h2>80.f</h2>
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
					<h2 class="title">我的播放列表</h2>
					<div class="entry">
						<p>
							<div align="center">
								<object classid="clsid:d27cdb6e-ae6d-11cf-96b8-444553540000"
									width="300" height="320" id="mp3player"
									codebase="http://fpdownload.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=8,0,0,0">
									<param name="movie"
										value="player/mp3player.swf?config=player/config_2.xml&file=player/xml\<%=user_id%>.xml?<%=new Random().nextInt()%>" />
									<embed
										src="player/mp3player.swf?config=player/config_2.xml&file=player/xml\<%=user_id%>.xml?<%=new Random().nextInt()%>"
										allowScriptAccess="always" width="300" height="320"
										name="mp3player" type="application/x-shockwave-flash"
										pluginspage="http://www.macromedia.com/go/getflashplayer" />
								</object>
							</div>
					</div>
					<p class="meta"></p>
				</div>
			</div>
			<!-- end contentn -->
			<div id="sidebar">
				<div id="about-box" style="font-size: 12px">
					<p>
						<%
							if (plutoUser == null) {
						%>
						<%@taglib prefix="sf"
							uri="http://www.springframework.org/tags/form"%>
						<label>${error}</label>
						<sf:form action="login.do" method="post" commandName="userVo"
							cssClass="niceform">

							<label for="textinput"> &nbsp;&nbsp;用户名： </label>
							<br /> &nbsp;&nbsp;
							<sf:input path="name" id="textinput" size="15" maxlength="16" />
							<br />
							<label for="passwordinput"> &nbsp;&nbsp;密 码： </label>
							<br /> &nbsp;&nbsp;
							<sf:password path="pwd" id="passwordinput" size="15"
								maxlength="16" />

							<br />
							<br /> &nbsp;&nbsp;&nbsp;&nbsp;
							<a href="register.jsp?height=175&width=300&modal=true"
								class="thickbox" title="我要注册">我要注册</a> &nbsp;&nbsp;
							<input type="submit" value="登  陆" />
						</sf:form>
					</p>
					<%
						} else {
					%>
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
					<%
						}
					%>

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
		<p>(c) 2008 Pluto Music All rights reserved. Design by
			Jessica(Www.TankMe.Cn).</p>
	</div>
</body>
</html>

