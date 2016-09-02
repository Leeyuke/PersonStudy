package com.spring.auto.cla;

import org.springframework.stereotype.Component;

import com.spring.auto.interf.Song;

@Component
public class OneSong implements Song {

	public void SingSong() {
		System.out.println("这是注解装配的歌。");
	}

}
