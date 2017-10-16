package com.zisal.demospringbootjms;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;

import javax.jms.Queue;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoSpringbootJmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringbootJmsApplication.class, args);
	}

	@Bean
	public ActiveMQConnectionFactory activeMQConnectionFactory(){
		ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory("tcp://localhost:61616");
		List<String> trustedPackages = new ArrayList<>();
		trustedPackages.add("java.lang");
		trustedPackages.add("java.math");
		trustedPackages.add("java.util");
		trustedPackages.add("com.zisal.demospringbootjms");
		factory.setTrustedPackages(trustedPackages);
		return factory;
	}

	@Bean
	public JmsListenerContainerFactory<?> employeeJmsFactory() {
		DefaultJmsListenerContainerFactory defaultJmsListenerContainerFactory = new DefaultJmsListenerContainerFactory();
		defaultJmsListenerContainerFactory.setConnectionFactory(activeMQConnectionFactory());
		return defaultJmsListenerContainerFactory;
	}

	@Bean(name = "queueEmployee")
	public Queue queue() {
		return new ActiveMQQueue("queueEmployee");
	}
}
