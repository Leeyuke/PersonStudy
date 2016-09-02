package Maven.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.auto.cla.OnePerson;
import com.spring.cla.TwoPerson;

public class Auto {

	public static void main(String[] args) {
		
		ApplicationContext atx = new ClassPathXmlApplicationContext("com/spring/xml/autospring.xml");

		TwoPerson tp = (TwoPerson) atx.getBean("twoperson");
		tp.getSing();
		
		OnePerson op = (OnePerson) atx.getBean("oneperson");
		System.out.println(op.getPersonAge());
		op.getPersonSong();
	}
	
}
