package org.crazyit.jpa.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.crazyit.jpa.entity.Person;
import org.crazyit.jpa.repository.PersonRepositoryCustom;

public class PersonRepositoryImpl implements PersonRepositoryCustom {

	@PersistenceContext 
	private EntityManager em;
	
	public List<Person> myQuery() {
		Query q = em.createQuery("from Person");
		return q.getResultList();
	}
}
