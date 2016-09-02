//一个单例类
package com.spring.cla;

public class SinglePerson {

	String say = "";
	
	private SinglePerson() {
		
	}
	
	//延迟加载实例
	private static class StageSinglePerson {
		static SinglePerson sp = new SinglePerson();
	}
	
	//返回实例
	public static SinglePerson getInstance() {
		return StageSinglePerson.sp;
	}
	
	public void SinglePersonSay(String say) {
		this.say = say;
		System.out.println("SinglePersonSay : " + say);
	}
	
}
