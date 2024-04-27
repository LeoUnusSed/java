package org.crazyit.mongo.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.types.ObjectId;
import org.crazyit.mongo.entity.Person;
import org.crazyit.mongo.repository.PersonRepCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.mongodb.core.CollectionCallback;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.DBObject;
import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;

public class PersonRepImpl implements PersonRepCustom {

	@Autowired
	private MongoTemplate mongoTemplate;

	public List<Person> myQuery() {
		List<Person> datas = mongoTemplate.execute(Person.class,
				new CollectionCallback<List<Person>>() {

                    public List<Person> doInCollection(MongoCollection collection)
							throws MongoException, DataAccessException {
						// 查询全部数据
						FindIterable fi = collection.find();
						MongoCursor<Document> cursor = fi.iterator(); 
						List<Person> result = new ArrayList<Person>();
						while (cursor.hasNext()) {
							// 获取源数据实例
						    Document source = cursor.next();
							// 转换为Person
							Person p = new Person();
							ObjectId objectId = (ObjectId)source.get("_id");
							p.setId(objectId.toHexString());
							p.setAge((Integer) source.get("age"));
							p.setName((String) source.get("name"));
							p.setCompany((String) source.get("company"));
							result.add(p);
						}
						return result;
					}
				});
		return datas;
	}
}
