package com.amsoftgroup.dbpool;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Database {

	private static String host = "tequila.sombrerosoft.com";
	private static int port = 5432;
	private static String database = "geospatial";
	private static String user = "geospatial";
	private static String password = "****";

	private static String TAG = "Database";
	
	//Static class instantiation
	static {

		try{
			new com.amsoftgroup.dbpool.JDCConnectionDriver(
					"org.postgresql.Driver", 
					"jdbc:postgresql://" + host + ":" + port + "/" + database,
					user, 
					password);

			System.out.println("Connection Succeeded: ");
	
		}catch(Exception e){
			System.out.println("Connection Failed: " + e.toString());
		}
	}


	public Connection getConnection() 
	throws SQLException{
		return DriverManager.getConnection(
		"jdbc:jdc:jdcpool");
	}

}


