package com.java.designPatterns.FactoryPattern;

public class FactoryPatternInAction {

	private static final String JDBC = "JDBC";
	private static final String HIBERNATE = "Hibernate";
	
	public static void main(String[] args) {
		
		//Instantiate Factory Class that holds logic to creation of connection class
		BaseConnFactory factory = new BaseConnFactory();
		
		//Access BaseInterface impl Hibernate class
		BaseInterface base1 = factory.getConnection(HIBERNATE);
		Person person=new Person();
		//set value to person obj
		System.out.println(base1.createRecord(person, HIBERNATE));
		
		//Access BaseInterface Impl JDBC class
		BaseInterface base2 = factory.getConnection(JDBC);
		System.out.println(base2.createRecord(person, JDBC));
	}

}
