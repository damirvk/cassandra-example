package hr.damirvk.core.entity;

import com.datastax.driver.mapping.annotations.UDT;

@UDT(keyspace = "core", name = "address")
public class Address {
	
	private String country;
	private String city;
	private String street;
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
}
