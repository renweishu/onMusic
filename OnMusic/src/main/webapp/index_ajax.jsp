<%@ page language="java"
	import="java.util.*,com.avicit.onlinemusic.entity.*,com.avicit.onlinemusic.vo.*,java.util.Date,java.text.SimpleDateFormat"
	pageEncoding="UTF-8"%>

<link href="css/thickbox.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/thickbox.js"></script>
<script type="text/javascript" src="js/nicejforms.js"></script>
<%
	User plutoUser = (User) session.getAttribute("PlutoUser");
	List<MusicVo> musicList = (ArrayList<MusicVo>) request
			.getAttribute("musicList");
%>

<%
	response.setHeader("Expires", "Sat, 6 May 1995 12:00:00 GMT");
	response.setHeader("Cache-Control",
			"no-store, no-cache, must-revalidate");
	response.addHeader("Cache-Control", "post-check=0, pre-check=0");
	response.setHeader("Pragma", "no-cache");

	if (musicList != null && musicList.size() > 0) {
		for (MusicVo mus : musicList) {

			String id = String.valueOf(mus.getId());
			String title = mus.getTitle();
			String singer = mus.getSinger();
			String special = mus.getSpecial();
			String value = mus.getValue();
			long time = Long.parseLong(mus.getTime());
			Date date = new Date(time);
			SimpleDateFormat sdf = new SimpleDateFormat(
					"yyyy年MM月dd日 HH:mm:ss");
			String music_time = sdf.format(date);
			String click = String.valueOf(mus.getClick());

			String comments = String.valueOf(mus.getListCommnet()
					.size());
			String filePath = mus.getUrl();
			Random rd = new Random();
			int rd_id = rd.nextInt(9999);
%>
<div class="post">
	<h2 class="title">
		<a href="show.jsp?id=<%=id%>"><%=title%></a>
	</h2>
	<h3 class="date">
		<%=music_time%>
	</h3>
	<div class="entry">
		<p>
			试听：
			<object type="application/x-shockwave-flash"
				data="player/audioplayer.swf" width="290" height="24"
				id="audioplayer<%=rd_id%>">
				<param name="movie" value="player/audioplayer.swf" />
				<param name="FlashVars"
					value="playerID=<%=rd_id%>&soundFile=<%=filePath%>" />
				<param name="quality" value="high" />
				<param name="menu" value="false" />
				<param name="wmode" value="transparent" />
			</object>
			<br /> 歌手：
			<%=singer%><br /> 所在专辑：
			<%=special%><br />
			<%=value%>
		</p>
	</div>
	<p class="meta">
		<a href="comments.do?musicID=<%=id%>" class="more">阅读全文</a> <b>|</b> <span
			class="comments"><%=comments%>条评论</span> <b>|</b> <span
			class="comments"><%=click%>次点击</span>
		<%
			if (plutoUser != null) {
		%>
		<b>|</b> <a href="JavaScript:addbox('<%=id%>');" class="comments">添加到我的音乐盒</a>
		<b>|</b> <img src="images/img14.gif"> &nbsp; <a
			href="sendmusic.jsp?height=230&width=350&modal=true&id=<%=id%>"
			class="thickbox" title="我要注册">点歌</a>
		<%
			}
		%>
	</p>
</div>
<%
	}
} else {
%>
<div class="post">暂无任何歌曲，快来分享给大家喔~！</div>
<%
	}
%>