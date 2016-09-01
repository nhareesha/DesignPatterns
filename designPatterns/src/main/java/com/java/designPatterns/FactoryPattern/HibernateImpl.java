package com.java.designPatterns.FactoryPattern;

public class HibernateImpl implements BaseInterface {
	
	/**
	 * Uses Hibernate connection 
	 */
	public String createRecord(Person person, String connType) {
		// TODO Auto-generated method stub
		return "Hibernate conn";
	}

}
