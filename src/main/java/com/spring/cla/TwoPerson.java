package com.spring.cla;

import com.spring.interf.Person;

public class TwoPerson implements Person {

	private int age = 0;
	private SongBom sbom = null;
	

	public SongBom getSbom() {
		return sbom;
	}

	public void setSbom(SongBom sbom) {
		this.sbom = sbom;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void getSing() {
		sbom.getSong();
	}

}
