package com.example.RestAPI_TODO;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class Authscurityconfiguration {

@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		return 
				http.authorizeHttpRequests(
						auth->auth
						.requestMatchers(HttpMethod.OPTIONS,"/**").permitAll()
						.anyRequest().permitAll())
				.httpBasic(Customizer.withDefaults())
				.sessionManagement(
						session->session.sessionCreationPolicy
						(SessionCreationPolicy.STATELESS))
				.csrf().disable()
				.build();
		}
	
}
