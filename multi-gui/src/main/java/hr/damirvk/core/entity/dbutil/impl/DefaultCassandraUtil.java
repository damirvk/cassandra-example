package hr.damirvk.core.entity.dbutil.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

import hr.damirvk.gui.login.LoginBB;

public class DefaultCassandraUtil {

	final static Logger logger = LoggerFactory.getLogger(DefaultCassandraUtil.class);

	
	private static final String CASSANDRA_IP = "192.168.5.13";
	
	public void createKeyspace(String keySpaceName) {
		// Query
		String query = "CREATE KEYSPACE" + keySpaceName + 
				" WITH replication " + "= {'class':'SimpleStrategy', 'replication_factor':1};";

		// creating Cluster object
		Cluster cluster = Cluster.builder().addContactPoint(CASSANDRA_IP).build();

		// Creating Session object
		Session session = cluster.connect();

		// Executing the query
		session.execute(query);

		// using the KeySpace
		session.execute("USE " + keySpaceName);
		logger.info("Keyspace: " + keySpaceName + " created!");
	}

	private Session getCassandraSession() {
		String serverIP = CASSANDRA_IP;
		String keyspace = "mykeyspace";

		Cluster cluster = Cluster.builder()
		  .addContactPoints(serverIP)
		  .build();

		Session session = cluster.connect(keyspace);
		return session;
	}
}
