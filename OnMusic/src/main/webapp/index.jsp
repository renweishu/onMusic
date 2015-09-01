<%@ page language="java"
	import="java.util.*,com.avicit.onlinemusic.entity.*,com.avicit.onlinemusic.vo.*"
	pageEncoding="UTF-8"%>
<jsp:useBean id="userVo" class="com.avicit.onlinemusic.vo.UserVo"
	scope="request" />
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%
	User plutoUser = (User) session.getAttribute("PlutoUser");
	List<MessageVo> mesList = (ArrayList<MessageVo>) request.getAttribute("mesList");
	List<TipVo> tiplist = (ArrayList<TipVo>) request.getAttribute("tiplist");
	List<LinkVo> linklist = (ArrayList<LinkVo>) request.getAttribute("linklist");
%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Onlinemusic</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/nicejforms.js"></script>
<script type="text/javascript" src="js/thickbox.js"></script>
<script type="text/javascript" src="js/audioplayer.js"></script>
<link href="css/default.css" rel="stylesheet" type="text/css" />
<link href="css/page.css" rel="stylesheet" type="text/css" />
<link href="css/thickbox.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="css/LoadingStatus.css" type="text/css" />
<style type="text/css" media="screen">
@import url(css/niceforms.css);
</style>
<script type="text/javascript">
	$(document).ready(function() {
		$.NiceJForms.build();
		dopage('http://localhost:8080/OnMusic/index/index_ajax.do?page=1');
	});

	function dopage(ajaxurl) {
		$('#LoadingStatus').show();
		$
				.ajax({
					url : ajaxurl,
					type : 'GET',
					dataType : 'html',
					timeout : 30000,
					async : false,
					error : function() {
						$('#content')
								.html(
										'<table  width="50%" border="0" align="center"> <tr> <td class="center_article" align="center">获取文章失败，请刷新此页面！！！</td></tr></table>');
						$('#LoadingStatus').hide(500);
					},
					success : function(html) {
						//window.location="#article_md";
						$('#LoadingStatus').hide(1000);
						$('#content').html(html);
					}
				});
	}

	function addbox(music_id) {
		$.ajax({
			url : 'addtobox.do?music_id=' + music_id,
			type : 'GET',
			dataType : 'html',
			timeout : 30000,
			async : false,
			error : function() {
				alert("出现错误！");
			},
			success : function(html) {
				//window.location="#article_md";
				alert(html);
			}
		});
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
	<div id="LoadingStatus">
		<img src="images/ajax-loader.gif" />
	</div>
	<hr />
	<div id="page">

		<div id="bg">
			<a name="article_md"></a>

			<div id="content"></div>
			<!-- end contentn -->
			<div id="sidebar">
				<div id="about-box" style="font-size: 12px">
					<p>
						<%
							if (plutoUser == null) {
						%>

						<label>JSTL表达式：
						    <c:if test="${error!=null}">
						      <fmt:message key="${error}" />
						    </c:if>
						
						</label><br /> <label>E L表达式：${error}</label>
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
						您有<%=(myMessage == 0) ? (myMessage) : ("<font color=red><strong>" + myMessage + "</strong></font>")%>封未读短消息，请
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
		<p>(c) 2013 onlinemusic</p>
	</div>
</body>
</html>
