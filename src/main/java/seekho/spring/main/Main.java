package seekho.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import seekho.spring.model.Child;


public class Main {

	public static void main(String[] args) { 
		
		
		ApplicationContext bean = new ClassPathXmlApplicationContext("application-context.xml");
		
		Child e2 = bean.getBean("child",Child.class);
		
		System.out.println(e2);




	}

}
