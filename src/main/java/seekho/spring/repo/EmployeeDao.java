package seekho.spring.repo;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import seekho.spring.model.Employee;
import seekho.spring.model.EmployeeMapper;



public class EmployeeDao {
	
	private JdbcTemplate jdbcTemplate;
	
	public EmployeeDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int saveEmployee(Employee e) {
		String query = "insert into employee (id, name,salary,gender)"
				+ " values('" + e.getId() + "', '" + e.getName() + "', '" + e.getSalary() + "', '" + e.getGender() + "')";
		System.out.println(query);
		return jdbcTemplate.update(query);
		
	}
	
	public int updateEmployee(Employee e) {
		String query = "update employee set name='" + e.getName() + "',salary='" + e.getSalary() + "' where id='"
				+ e.getId() + "' ";
		System.out.println(query);
		return jdbcTemplate.update(query);
	}
	
	public int deleteEmployee(Employee e) {
		String query = "delete from employee where id = '" + e.getId() + "'" ;
		System.out.println(query);
		return jdbcTemplate.update(query);
	}
	

	public List<Employee> getAllEmployee(){
		
		return jdbcTemplate.query("select * from employee", new EmployeeMapper());
		
	}


}
