package com.shah.jobpost;

import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class OpenAPIConfiguration {
	
	@Value("${shah.openapi.dev-url}")
	private String devUrl;	
	
	@Bean
	public OpenAPI getOpenAPI() {
		
		Server devServer = new Server();
		devServer.setUrl(devUrl);
		devServer.setDescription("Server URL for Development environment");
		
		Server stgServer = new Server();
		stgServer.setUrl(devUrl);
		stgServer.setDescription("Server URL for Stage environment"); 
		
		Contact contact = new Contact();
		contact.setName("Shahrukh Mullani");
		contact.setEmail("mullanishah@gmail.com");
		contact.setUrl("https://github.com/mullanishah");
		
		License mitLicense = new License()
				.name("MIT Licence")
				.url("https://choosealicense.com/licenses/mit/");
		
		Info info = new Info()
				.title("JobPost- Spring Boot application")
				.version("1.0.0")
				.contact(contact)
				.description("This API exposes endpoints to manage JobPost application")
				.termsOfService("https://docs.github.com/en/site-policy/github-terms/github-terms-of-service")
				.license(mitLicense);
		
		return new OpenAPI().info(info).servers(List.of(devServer, stgServer));
	}
}
