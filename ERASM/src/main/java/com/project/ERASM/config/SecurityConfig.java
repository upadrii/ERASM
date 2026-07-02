package com.project.ERASM.config;


import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.project.ERASM.filter.JWTAuthenticationFilter;
import com.project.ERASM.util.JWTUtil;



@Configuration
@EnableWebSecurity
public class SecurityConfig {



	
	private JWTUtil jwtUtil;
	private UserDetailsService userDetailsService;
	
	
	
	public SecurityConfig(JWTUtil jwtUtil, UserDetailsService userDetailsService) {
		this.jwtUtil = jwtUtil;
		this.userDetailsService = userDetailsService;
	}
	
	@Bean
	public DaoAuthenticationProvider daoAuthenticationProvider()
	{
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider(userDetailsService);
		provider.setPasswordEncoder(passwordEncoder());
		return provider;
	}

	@Bean
	public PasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http,
			AuthenticationManager authenticationManager, JWTUtil jwtUtil) throws Exception
	{
		
		JWTAuthenticationFilter jwtAuthFilter = new JWTAuthenticationFilter(authenticationManager, jwtUtil);
		
		http
		.authorizeHttpRequests(auth -> auth
				.requestMatchers("/auth/register").permitAll()
	            .requestMatchers(HttpMethod.GET, "/student-api/getAll")
	            .hasAnyRole("ADMIN", "USER")
	            .requestMatchers(HttpMethod.POST, "/student-api/add")
	            .hasRole("ADMIN")
	            .requestMatchers(HttpMethod.GET, "/student-api/get/{id}")
	            .hasAnyRole("ADMIN", "USER")
	            .requestMatchers(HttpMethod.DELETE, "/student-api/delete/{id}")
	            .hasRole("ADMIN")
	            .requestMatchers(HttpMethod.PUT, "/student-api/change/{id}")
	            .hasAnyRole("ADMIN", "USER")
	            .anyRequest().authenticated())
				
			
		.csrf(csrf->csrf.disable())
		.addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class);
		//.httpBasic(Customizer.withDefaults());
		//.formLogin(Customizer.withDefaults());
		
		return http.build();
	}
	
	@Bean
	public AuthenticationManager authenticationManager()
	{
		return new ProviderManager(
				Arrays.asList(daoAuthenticationProvider())
				);
	}
}