package hr.damirvk.core.entity;

import java.util.ArrayList;
import java.util.List;

import com.datastax.driver.mapping.annotations.Column;
import com.datastax.driver.mapping.annotations.PartitionKey;
import com.datastax.driver.mapping.annotations.Table;

@Table(keyspace = "core", name = "user")
public class User {
	
	@PartitionKey
	private Integer user_id;
	
	@Column(name = "address")
	private Address address;
	@Column(name = "phone_number")
	private PhoneNumber phoneNumber;
	
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public PhoneNumber getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
