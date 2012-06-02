package com.ziroby.helloCassanda2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		Greeting greeting = new Greeting();
		
		greeting.setGreetingWord("Hello");
		greeting.setAddressee("World");
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("example");
		EntityManager entityManager = factory.createEntityManager();
		
		entityManager.persist(greeting);
		entityManager.close();
		factory.close();		
	}
}
