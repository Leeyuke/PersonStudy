package com.spring.cla;

import com.spring.interf.Person;

public class OnePerson implements Person {

	int age = 0 ;
	OneSong song = null;
	
	public OnePerson() {}
	public OnePerson(int age) {
		this.age = age;
	}
	public OnePerson(int age, OneSong song) {
		this.age = age;
		this.song = song;
	}
	
	public int getAge() {
		return age;
	}

	public void getSing() {
		song.getSong();
	}
	
	public void initSing() {
		System.out.println("Start sing ......");
	}
	public void destorySing() {
		System.out.println("Destory sing ......");
	}
}
