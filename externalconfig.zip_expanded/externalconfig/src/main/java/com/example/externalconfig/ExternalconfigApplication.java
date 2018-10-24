package com.example.externalconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class ExternalconfigApplication implements EnvironmentPostProcessor {

	public static void main(String[] args) {
		SpringApplication.run(ExternalconfigApplication.class, args);
	}

	@Override
	public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {

		System.out.println("postprocessennv is called");

		System.out.println(environment.getProperty("name"));

	}
}
