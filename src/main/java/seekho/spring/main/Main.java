package seekho.spring.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import seekho.spring.model.Employee;
import seekho.spring.repo.EmployeeDao;

public class Main {

	public static void main(String[] args) { 
		
		
		ApplicationContext ioc = new ClassPathXmlApplicationContext("application-context.xml");
		
		EmployeeDao edao  = ioc.getBean("edao",EmployeeDao.class);
		System.out.println("Dao" +edao);
		

		
		Employee emp1 = new Employee(2, "Manoj Kumar","Male",60000);
		
		
		//edao.saveEmployee(emp1);
		// edao.updateEmployee(emp1);
		//edao.deleteEmployee(emp1);
		
		
		
		List<Employee> allEmp = edao.getAllEmployee();
		
		System.out.println(allEmp);
		
	

	}

}
