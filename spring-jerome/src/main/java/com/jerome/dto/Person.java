package com.jerome.dto;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author liusj
 */
public class Person implements InitializingBean {
	private String name;
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	@Override
	public void afterPropertiesSet() throws Exception {

	}

	public void init() {
		this.name = "jerome";
		this.age = 17;
	}
}
