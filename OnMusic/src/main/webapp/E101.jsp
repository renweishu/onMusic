<%@ page language="java" pageEncoding="utf-8" isErrorPage="true"%>
<%@ page import="java.io.PrintWriter"%>
<html>
<head>
<title>数据库更新出错</title>
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
					<h2 class="title">
						错误码:[A0281]
					</h2>
					<h3 class="date">
						错误消息:[对数据库写操作出错-某个字段过长]
					</h3>


				</div>
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

