package seekho.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import seekho.spring.model.Employee;

public class Main {

	public static void main(String[] args) { 
		
		
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("application-context.xml");
		
		Employee bean = factory.getBean("emp1",Employee.class);
		
		System.out.println(bean);
		
		factory.registerShutdownHook();

	 
 
	}

}
