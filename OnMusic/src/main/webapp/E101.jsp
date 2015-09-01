<%@ page language="java" pageEncoding="utf-8" isErrorPage="true"%>
<%@ page import="java.io.PrintWriter"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>OnlineMusic</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jquery.form.js"></script>
<script type="text/javascript" src="js/nicejforms.js"></script>
<script type="text/javascript" src="js/audioplayer.js"></script>
<link href="css/table.css" rel="stylesheet" type="text/css" />
<link href="css/page.css" rel="stylesheet" type="text/css" />
<link href="css/default.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="css/LoadingStatus.css" type="text/css" />
<link href="css/thickbox.css" rel="stylesheet" type="text/css" />
<style type="text/css" media="screen">
@import url(css/niceforms.css);
</style>
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
					<h2 class="title">错误页:[E101]</h2>
					<h2 class="title">错误码:[A0281]</h2>
					<h2 class="title">错误消息:[对数据库写操作出错-某个字段过长]</h2>


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

