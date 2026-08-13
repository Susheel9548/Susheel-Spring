package seekho.spring.model;

public class Address{
	
	private String city, state;
	
	
	public Address() {
		super();
		System.out.println("Address.Address()");
	
	}

	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
		System.out.println("Address.Address(constPera)");
	}
	
	

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		System.out.println("Address.setCity()");
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		System.out.println("Address.setState()");
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	
	
	
}

