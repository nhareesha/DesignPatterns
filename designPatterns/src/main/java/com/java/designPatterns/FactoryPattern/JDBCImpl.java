package com.java.designPatterns.FactoryPattern;

public class JDBCImpl implements BaseInterface {
	
	/**
	 * Uses JDBC connector to connect to DB
	 */
	public String createRecord(Person person, String connType) {
		// TODO Auto-generated method stub
		return "JDBC Connection";
	}

}
