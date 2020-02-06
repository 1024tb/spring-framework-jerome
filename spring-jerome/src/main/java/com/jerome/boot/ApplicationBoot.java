package com.jerome.boot;

import com.jerome.dto.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author liusj
 */

@Configuration
@ComponentScan(basePackages = {"com.jerome"})
public class ApplicationBoot {

	@Bean(initMethod = "init")
	public Person person() {
		return new Person();
	}
}
