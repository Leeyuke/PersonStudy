package com.spring.cla;

import com.spring.interf.Song;

public class OneSong implements Song {

	String song = null;
	
	public OneSong() {
		this.song = "Hello yuke! This is your first Spring !";
	}
	
	public void getSong() {
		System.out.println(song);
		
	}

	
	
}
