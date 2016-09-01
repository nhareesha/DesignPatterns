package com.java.designPatterns.FactoryPattern;

/**
 * This is the Factory class which hides the creation logic of the underlying class
 * @author Hareesha
 *
 */
public class BaseConnFactory {
	private  BaseInterface base;
	
	public BaseInterface getConnection(String connType){
		
		if(connType!=null && connType.equals("Hibernate")){
			return new HibernateImpl();
		}else if(connType!=null && connType.equals("JDBC")){
			return new JDBCImpl();
		}
		return null;
	}

}
