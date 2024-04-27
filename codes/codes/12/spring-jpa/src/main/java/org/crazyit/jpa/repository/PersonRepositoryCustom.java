package org.crazyit.jpa.repository;

import java.util.List;

import org.crazyit.jpa.entity.Person;

public interface PersonRepositoryCustom {

	List<Person> myQuery();
}
