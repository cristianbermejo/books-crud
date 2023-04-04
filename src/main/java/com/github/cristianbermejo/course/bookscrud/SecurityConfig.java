package com.github.cristianbermejo.course.bookscrud;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {
	
	// Roles and users
	@Bean
	public InMemoryUserDetailsManager userDetails() throws Exception {
		List<UserDetails> users = List.of(
				User
					.withUsername("user1")
					.password("{noop}user1") // {noop} is used so we don't have to use encryption
					.roles("USER")
					.build(),
				User.
					withUsername("admin")
					.password("{noop}admin")
					.roles("USER", "ADMIN")
					.build()
		);
		
		return new InMemoryUserDetailsManager(users);
	}
	
	// Security policies
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.csrf().disable()
			.authorizeHttpRequests()
			.requestMatchers(HttpMethod.POST, "/book").hasRole("ADMIN")
			.requestMatchers("/books").authenticated()
			.and().httpBasic();
		
		return http.build();
	}
}
