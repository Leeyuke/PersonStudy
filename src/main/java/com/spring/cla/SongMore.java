package com.spring.cla;

import java.util.Collection;
import java.util.Map;

import com.spring.interf.AllSong;
import com.spring.interf.Song;

public class SongMore implements Song {

	//通过Bean装载获得com.spring.allsong内所有类的集合
	Collection<AllSong> colsong;
	public Collection<AllSong> getColsong() {
		return colsong;
	}
	public void setColsong(Collection<AllSong> colsong) {
		this.colsong = colsong;
	}
	//调用每一个类的Song方法
	public void getSong() {
		for(AllSong allsong : colsong) {
			allsong.Song();
		}
	}

	
	Map<String, AllSong> mapsong;
	public Map<String, AllSong> getMapsong() {
		return mapsong;
	}
	public void setMapsong(Map<String, AllSong> mapsong) {
		this.mapsong = mapsong;
	} 
	public void getMapSong() {
		for(String key : mapsong.keySet()) {
			System.out.print(key + " and ");
			AllSong allsong = mapsong.get(key);
			allsong.Song();
		}
	}
	
}
