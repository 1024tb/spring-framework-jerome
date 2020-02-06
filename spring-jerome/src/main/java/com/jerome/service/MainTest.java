package com.jerome.service;

import com.jerome.boot.ApplicationBoot;
import com.jerome.dto.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liusj
 */
public class MainTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationBoot.class);
		Person person = (Person) ctx.getBean("person");
		System.out.println(person.toString());
		ctx.close();
	}
}
