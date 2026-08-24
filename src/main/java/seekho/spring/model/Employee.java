package seekho.spring.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean , DisposableBean{
	
	private int id;
	private String name, gender;
	
	private Address address;
	
//	intializingBean Method
	@Override
	public void afterPropertiesSet() throws Exception{
		System.out.println("Employee.afterPropertiesSet()");
	}
	
	//DisposableBean Method
	@Override
	public void destroy() throws Exception{
		System.out.println("Emloyee.destroy()");
	}
	
	private void xmlInitMethod() {
		System.out.println("Employee.xmlInitMethod");
	}
	
	private void xmlDestroyMehod() {
		System.out.println("Employee.xmlDestriyMethod");
	}
	
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Employee.setAddress()");
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
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + "]";
	}
	
	
	
	
	

}
