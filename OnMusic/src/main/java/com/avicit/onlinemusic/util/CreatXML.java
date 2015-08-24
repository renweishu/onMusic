package com.avicit.onlinemusic.util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.output.XMLOutputter;
import org.springframework.beans.factory.annotation.Autowired;

import com.avicit.onlinemusic.entity.Music;
import com.avicit.onlinemusic.service.MusicService;

public class CreatXML {

	
	private String str = "3,2,4,5,6,7";
	private String [] playListArr;
	private String path;
	
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public void bulidXML(List<Music> list,HttpServletRequest request,String userId) throws IOException, JDOMException, SQLException {
		//创建XML头
		Element playList = new Element("playlist");;
		Document Doc = new Document(playList);
		playList = Doc.getRootElement();
		playList.setAttribute("version", "1");
		playList.setAttribute("xmln","http://xspf.org/ns/0/");
		Element title = new Element("title");
		title.setText("Pluto's Player");
		playList.addContent(title);
		//头结束
		
		Element trackList = new Element("trackList");
		playList.addContent(trackList);
		//trackList
		

		for(Music music:list){
						
			String music_title =music.getTitle(); 
			String music_singer =music.getSinger();
			String music_url = music.getUrl();
			Element track = new Element("track");
			Element annotation = new Element("annotation");
			annotation.setText(music_title + " - " + music_singer);
			track.addContent(annotation);
			Element location = new Element("location");
			location.setText("../" + music_url);
			track.addContent(location);
			trackList.addContent(track);
		}
		/*
		DBConnection conn  = new DBConnection();
		//根据ID选择music_box
		
		ResultSet rs = conn.executeQuery("select music_box from user where id = "+id+"");
		rs.next();
		str = rs.getString("music_box");
		if(function.isInvalid(str)){
			return ;
		}
		
		playListArr = str.split(",");
		//System.out.println(playListArr[1]);
		for(int i=0;i<=playListArr.length ;i++){
			//获取每首歌曲信息
			
			ResultSet listRS = conn.executeQuery("select * from music where id="+playListArr[i]+"");
			listRS.next();
			String music_title = listRS.getString("title");
			String music_singer = listRS.getString("singer");
			String music_url = listRS.getString("url");
			Element track = new Element("track");
			Element annotation = new Element("annotation");
			annotation.setText(music_title + " - " + music_singer);
			track.addContent(annotation);
			Element location = new Element("location");
			location.setText(music_url);
			track.addContent(location);
			trackList.addContent(track);
			
		}
		*/
		/*
		Element track = new Element("track");
		Element annotation = new Element("annotation");
		annotation.setText("Song");
		track.addContent(annotation);
		Element location = new Element("location");
		location.setText("http://127.0.0.1/2006113012325210077440240.mp3");
		track.addContent(location);
		trackList.addContent(track);

		*/
		

		String user_id = userId;
		XMLOutputter XMLOut = new XMLOutputter();
		XMLOut.output(Doc, new FileOutputStream(request.getSession().getServletContext().getRealPath("/player/xml/" + user_id + ".xml")));
	}
}
