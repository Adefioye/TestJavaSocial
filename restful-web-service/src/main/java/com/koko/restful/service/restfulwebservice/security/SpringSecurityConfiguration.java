package com.koko.restful.service.restfulwebservice.security;

import org.springframework.context.annotation.Bean;
import static org.springframework.security.config.Customizer.withDefaults;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfiguration {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

		// All requests should be authenticated
		http.authorizeHttpRequests(auth -> auth.anyRequest().authenticated());
		// If a request is not authenticated, a webpage is shown
		http.httpBasic(withDefaults());
		// Avoid CSRF(POST, PUT)
		http.csrf().disable();

		return http.build();
	}
}
