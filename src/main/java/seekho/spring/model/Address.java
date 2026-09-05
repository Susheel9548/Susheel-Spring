package seekho.spring.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "add1")
@Primary
public class Address implements IAddress{
	
	public Address() {
		System.out.println("Address.Address()");
	}
	
	private String city="Noida";
	private String state="UP";
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	
	
	


}
