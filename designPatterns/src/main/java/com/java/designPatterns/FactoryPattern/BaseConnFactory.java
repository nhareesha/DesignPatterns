package com.java.designPatterns.FactoryPattern;

/**
 * This is the Factory class which hides the creation logic of the underlying class
 * @author Hareesha
 *
 */
public class BaseConnFactory {
	private static final String JDBC = "JDBC";
	private static final String HIBERNATE = "Hibernate";
	private  BaseInterface base;
	
	public BaseInterface getConnection(String connType){
		
		if(connType!=null && connType.equals(HIBERNATE)){
			 base = new HibernateImpl();
			 return base;
		}else if(connType!=null && connType.equals(JDBC)){
			 base = new JDBCImpl();
			 return base;
		}
		return null;
	}

}
