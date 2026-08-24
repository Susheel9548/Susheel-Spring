package seekho.spring.model;

public class Parent {
	
	private String companyName;
	private String empId;
	
	public String getCompanyName() {
		return companyName;
	}
	
	public void setCompanyName(String companyName) {
		System.out .println("p-setName");
		this.companyName = companyName;
	}
	
	public String getEmpId() {
		return empId;
	}
	
	public void setEmpId(String empId) {
		this.empId = empId;
		System.out.println("p-setId");
	}
	
	

}
