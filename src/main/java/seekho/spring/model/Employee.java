package seekho.spring.model;

public class Employee {
	
	private int id;
	private String name, gender;
	public Employee() {
		super();
		System.out.println("Employee.employee()");
	
	}
	public Employee(int id, String name, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		System.out.println("Employee.employee(3) ");
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		System.out.println("Employee.setId() ");
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		System.out.println("Employee.setName() ");
		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
		System.out.println("Employee.setGender()");
	}
	
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + "]";
//	}
	
	
	
	

}
