package hr.damirvk.core.entity;

import com.datastax.driver.mapping.annotations.UDT;

@UDT(keyspace = "core", name = "phonenumber")
public class PhoneNumber {
	
//	public enum Type {
//		PERSONAL, WORK;
//	}
	
	private Integer number;
//	private Type phoneType = Type.PERSONAL;
	
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
//	public Type getPhoneType() {
//		return phoneType;
//	}
//	public void setPhoneType(Type phoneType) {
//		this.phoneType = phoneType;
//	}

}
