package com.hypech.blog;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import javax.swing.text.AbstractDocument;

@SpringBootTest(classes = {QinghuaApplication.class}, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class IntegrationTests{

    @Autowired
    TestRestTemplate restTemplate;

//    @Test
//    void assertBlogPageTitle Content And StatuCode(){
//        ResponseEntity<String> response = restTemplate.getForEntity("/blog", String.class);
//        assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
//        assertThat(entity,.getBody()).contains("<h1>Hello WWorld</h1>");
}
