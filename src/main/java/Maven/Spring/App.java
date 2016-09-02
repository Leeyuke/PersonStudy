package Maven.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.cla.OnePerson;
import com.spring.cla.SinglePerson;
import com.spring.cla.SongMore;
import com.spring.cla.TwoPerson;

public class App {
	public static void main(String[] args) {
		
		//File file1 =new File("xml/springbean.xml") ;
		ApplicationContext atx = new ClassPathXmlApplicationContext("com/spring/xml/springbean.xml");
		
		OnePerson person = (OnePerson) atx.getBean("person");
		System.out.println("age = " + person.getAge());
		person.getSing();
		
		SinglePerson singleperson = SinglePerson.getInstance();
		singleperson.SinglePersonSay("Hello yuke");
		
		System.out.println("\nNow this is two person ......\n");
		
		TwoPerson tp = (TwoPerson) atx.getBean("twoperson");
		System.out.println("TwoPerson age = " + tp.getAge());
		tp.getSing();
		
		System.out.println("\nNow this is song more ......\n");
		SongMore songmore = (SongMore) atx.getBean("songmore");
		songmore.getSong();
		songmore.getMapSong();
		
	}
}
