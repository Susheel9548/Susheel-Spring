package seekho.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import seekho.spring.model.Address;
import seekho.spring.model.Employee;

public class Main {

	public static void main(String[] args) { 
		
		
		ApplicationContext ioc = new AnnotationConfigApplicationContext("seekho.spring");
		
		Employee bean = ioc.getBean("employee",Employee.class);
		
		System.out.println(bean);
		


		


	}

}
