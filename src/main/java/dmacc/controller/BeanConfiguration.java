package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Team;

@Configuration
public class BeanConfiguration {

	@Bean
	public Team team() {
		Team bean = new Team();
		return bean;
	}
}
