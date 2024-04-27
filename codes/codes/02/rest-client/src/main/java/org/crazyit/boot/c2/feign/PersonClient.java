package org.crazyit.boot.c2.feign;

import org.crazyit.boot.c2.Person;

import feign.Param;
import feign.RequestLine;

/**
 * Feign客户端接口
 * @author 杨恩雄
 */
public interface PersonClient {

	  @RequestLine("GET /person/{name}")
	  Person getPerson(@Param("name") String name);

}
