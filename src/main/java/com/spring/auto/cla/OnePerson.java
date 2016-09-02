package com.spring.auto.cla;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.auto.interf.Person;
import com.spring.auto.interf.Song;

@Component("oneperson")	//将POJO类注解成Bean，其id为oneperson
public class OnePerson implements Person {

	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	private Song song;
	public Song getSong() {
		return song;
	}
	@Autowired
	public void setSong(Song song) {
		this.song = song;
	}

	
	public int getPersonAge() {
		return age;
	}

	public void getPersonSong() {
		song.SingSong();
	}

}
