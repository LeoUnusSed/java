package org.crazyit.redis.repository;

import java.util.List;

import org.crazyit.redis.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRep extends CrudRepository<Person, String>, PersonRepCustom {

	List<Person> findByName(String name);
	
	List<Person> findTop2ByName(String name);
}
