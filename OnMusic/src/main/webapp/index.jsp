<%@ page language="java"
	import="java.util.*,com.avicit.onlinemusic.entity.*,com.avicit.onlinemusic.vo.*"
	pageEncoding="UTF-8"%>
<jsp:useBean id="userVo" class="com.avicit.onlinemusic.vo.UserVo"
	scope="request" />
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!-- 后台传递的四个变量值 PlutoUser对应session用户信息    mesList，tiplist，linklist对应三个list -->
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
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
					<c:if test="${PlutoUser ==null}">
						<p>
							<label> <c:if test="${error!=null}">
									<font color=red>注意:<fmt:message key="${error}" /></font>
								</c:if>
							</label><br />
							<sf:form action="login.do" method="post" commandName="userVo"
								cssClass="niceform">
								<!-- 页面头部显示一个错误清单 path="*"：显示所有错误   path="lastName*"：显示所有与lastName字段有关的错误-->
								<!-- <label for="textinput"> &nbsp;&nbsp;错误消息提示： </label> -->
								<!-- <sf:errors path="*"  /><br /> &nbsp;&nbsp; -->

								<label for="textinput">用户名:</label>
								<sf:input path="name" id="textinput" size="15" maxlength="16" />
								<br />
								&nbsp;<sf:errors path="name" cssStyle="color:red"/>
								<br />
								<br />
								<label for="passwordinput">密 &nbsp;&nbsp;&nbsp;码:</label>
								<sf:password path="pwd" id="passwordinput" size="15"
									maxlength="16" />
								<br />
								&nbsp;<sf:errors path="pwd" cssStyle="color:red"/>
								<br />
								<br /> &nbsp;&nbsp;&nbsp;&nbsp;
							<a href="register.jsp?height=175&width=300&modal=true"
									class="thickbox" title="我要注册">我要注册</a> &nbsp;&nbsp;
							<input type="submit" value="登  陆" />
							</sf:form>
						</p>
					</c:if>
					<c:if test="${PlutoUser !=null}">

						<p>
							<c:out value="${PlutoUser.name}"></c:out>
							，欢迎您回来！
						</p>
						<p>
							您有<font color=red> <strong><c:out
									value="${mesList.size()}"></c:out></strong></font>封未读短消息，请 <a href="message.do"
								style="color: red">查看</a>！ <br /> 播放我上次创建的 <a href="player"
								style="color: red">[播放列表]</a>！ <br /> 如果您有音乐分享，您可以点我进行 <a
								href="uploadmusicPage.do" style="color: red">[上传音乐]</a>！ <br />
						</p>
						<p>
							退出请点 <a href="logout.do" style="color: #FF0000">[注销登陆]</a>！
						</p>
					</c:if>

				</div>
				<ul>
					<li>
						<h2>最新消息</h2>
						<ul>
							<c:forEach items="${tiplist}" var="tipV">
								<li><c:out value="${tipV.value}"></c:out></li>
							</c:forEach>
						</ul>
					</li>
					<li>
						<h2>友情链接</h2>
						<ul>
							<c:forEach items="${linklist}" var="link">
								<li><a href="<c:out value="${link.value}"/>"><c:out
											value="${link.title}"></c:out></a></li>
							</c:forEach>
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
		<p>(c) 2015 by mac</p>
	</div>
</body>
</html>
