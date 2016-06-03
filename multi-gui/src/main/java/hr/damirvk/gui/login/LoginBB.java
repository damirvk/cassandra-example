package hr.damirvk.gui.login;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;
import com.datastax.driver.core.UDTValue;
import com.datastax.driver.mapping.Mapper;
import com.datastax.driver.mapping.MappingManager;

import hr.damirvk.core.entity.Address;
import hr.damirvk.core.entity.PhoneNumber;
import hr.damirvk.core.entity.User;

@Named
@javax.faces.view.ViewScoped
public class LoginBB implements Serializable{
	
	final static Logger logger = LoggerFactory.getLogger(LoginBB.class);

	/**
	 * 
	 */
	private static final long serialVersionUID = -155197642051992667L;
	
	
	@PostConstruct
	public void onCreate() {
	}
	
	public void addUser() {
		Mapper<User> mapper = new MappingManager(getCassandraSession()).mapper(User.class);
		Address address = new Address();
		address.setCountry("Croatia");
		address.setCity("Osijek");
		address.setStreet("Anina Ul");
		PhoneNumber phone1 = new PhoneNumber();
		phone1.setNumber(Integer.valueOf("989084769"));
//		PhoneNumber phone2 = PhoneNumber.getInstance().setNumber(Integer.valueOf("913234829"));
		
		User user = new User();
		user.setUser_id(Integer.valueOf(1));
		user.setAddress(address);
		user.setPhoneNumber(phone1);
		
		mapper.save(user);
	}
	
	public void showAll() {

//		Mapper<Users> mapper = new MappingManager(getCassandraSession()).mapper(Users.class);
//		Users user = mapper.get(Integer.valueOf(1745));
//		logger.info("First name:" + user.getFname());
		
		
		String cqlStatement = "SELECT * FROM user;";
		Session session = getCassandraSession();
		for (Row row : session.execute(cqlStatement)) {
//			
//			UDTValue address = row.getUDTValue("address");
//			String country = address.getString("country"); // by field name
//			String city = address.getString("city"); // by field name
//			String street = address.getString("street"); // by field name
			
//			UDTValue phone = row.getUDTValue("phone");

//			logger.info(country + "#" + city + "#" + street);
			logger.info(row.toString());
		}
	}
	
	private Session getCassandraSession() {
		String serverIP = "192.168.5.13";
		String keyspace = "core";
		
		Cluster cluster = Cluster.builder()
		  .addContactPoints(serverIP)
		  .build();

		Session session = cluster.connect(keyspace);
		return session;
	}
}
