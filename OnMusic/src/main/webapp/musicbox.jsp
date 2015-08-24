<%@ page language="java"
	import="java.util.*,com.avicit.onlinemusic.entity.*,com.avicit.onlinemusic.vo.*"
	pageEncoding="UTF-8"%>
<jsp:useBean id="userVo" class="com.avicit.onlinemusic.vo.UserVo"
	scope="request" />
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%
	User plutoUser = (User)session.getAttribute("PlutoUser");
 List<MessageVo> mesList= (ArrayList<MessageVo>)request.getAttribute("mesList");
 List<TipVo> tiplist =(ArrayList<TipVo>)request.getAttribute("tiplist");
 List<LinkVo> linklist=(ArrayList<LinkVo>)request.getAttribute("linklist");
 List<MusicVo> musicBoxList=(ArrayList<MusicVo>)request.getAttribute("musicBoxList");
%>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>OnlineMusic</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/audioplayer.js"></script>
<link href="css/table.css" rel="stylesheet" type="text/css" />
<link href="css/page.css" rel="stylesheet" type="text/css" />
<link href="css/default.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="css/LoadingStatus.css" type="text/css" />
<link href="css/thickbox.css" rel="stylesheet" type="text/css" />
<script type="text/javascript">

	$(document).ready(function() {

		// 删除消息
		$("#choice").click(function() {

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
	function selectAll(chk) {
		var chk = document.form2.chkAll.checked;
		for (i = 0; i < document.all.length; i++) {
			if (document.all[i].name == "list") {
				document.all[i].checked = chk;
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
					<h2 class="title">我的音乐盒:${error}${success}</h2>
					<div id="LoadingStatus">
						<img src="images/ajax-loader.gif" />
					</div>
					<div class="entry" id="musicbox">
						<p>
							<%
								if (musicBoxList != null && musicBoxList.size()>0) {
									//音乐盒中存在音乐！
							%>

							<form method="post" name="form2" id="form2" action="setbox.do">
								<TABLE width="100%" align="center" class="mytable">
									<THEAD>
										<TR class=odd>
											<TH scope=col width="5">ID</TH>
											<TH scope=col>歌曲</TH>
											<TH scope=col>歌手</TH>
											<TH scope=col>试听</TH>
											<TH scope=col><input type="checkbox" name="chkAll"
												value="" title="全选/取消" onclick="selectAll();" /></TH>
										</TR>
									</THEAD>
									<TFOOT></TFOOT>
									<%
										for (MusicVo music : musicBoxList) {
												try {

													String title = music.getTitle();
													String singer = music.getSinger();
													String url = music.getUrl();

													out.println("<TBODY><TR class=odd>");

													out.println("<TD>" + music.getId() + "</TD>");
													out.println("<TD>" + title + "</TD>");
													out.println("<TD>" + singer + "</TD>");
													Random rd = new Random();
													int rd_id = rd.nextInt(9999);
													String player = "<object type=application/x-shockwave-flash data=player/audioplayer.swf width=200 height=15 id=audioplayer"
															+ rd_id
															+ "> <param name=movie value=player/audioplayer.swf /><param name=FlashVars value=playerID="
															+ rd_id
															+ "&soundFile="
															+ url
															+ " /><param name=quality value=high /><param name=menu value=false /><param name=wmode value=transparent /></object>";
													out.println("<TD>" + player + "</TD>");
													out.println("<TD><input type=\"checkbox\" name=\"list\" id=\"list"
															+ music.getId()
															+ "\" value=\""
															+ music.getId()
															+ "\"></TD>");
												} catch (Exception e) {
													//数组越界就跳过

												}
											}
											out.println("</TBODY></TABLE>");
											boolean noAjax = false;
											//out.println("<div class=\"yahoo2\">"+ function.page(maxPage, nowpage, pagesize,"musicbox.jsp", noAjax) + "</div><br />");
											out.println("<div align=center> <label>选中项：<select name=select id=select class=width_100> <option value=play>创建播放列表</option><option value=del>删除盒子音乐</option> </select> </label> <label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"button\" id=\"choice\" value=提交> </label>  </div></FORM>");
											out.println("");
										} else {
											out.println("对不起，暂时您的音乐盒中没有任何音乐！");
										}
									%>

									<p class="meta"></p>
									</div>
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
												<sf:form action="login.do" method="post"
													commandName="userVo" cssClass="niceform">

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
												<a href="message.do" style="color: red">查看</a>！ <br />
												播放我上次创建的 <a href="player" style="color: red">[播放列表]</a>！ <br />
												如果您有音乐分享，您可以点我进行 <a href="uploadmusicPage.do"
													style="color: red">[上传音乐]</a>！ <br />
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
										<p>(c) 2008 onlinemusic</p>
									</div>
</body>
</html>

