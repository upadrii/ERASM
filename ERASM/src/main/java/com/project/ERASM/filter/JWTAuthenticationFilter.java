package com.project.ERASM.filter;


import java.io.IOException;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.filter.OncePerRequestFilter;

import com.project.ERASM.dto.request.LoginRequestDTO;
import com.project.ERASM.util.JWTUtil;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tools.jackson.databind.ObjectMapper;

public class JWTAuthenticationFilter extends OncePerRequestFilter{
	
	private final AuthenticationManager authenticationManager;
	private final JWTUtil jwtUtil;
	

	public JWTAuthenticationFilter(AuthenticationManager authenticationManager, JWTUtil jwtUtil) {
		this.authenticationManager = authenticationManager;
		this.jwtUtil = jwtUtil;
	}


	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		if(!request.getServletPath().equals("/generate-token")) {
			filterChain.doFilter(request, response);
			return;
		}
		
		ObjectMapper objectMapper=new ObjectMapper();
		LoginRequestDTO loginRequest=objectMapper.readValue(request.getInputStream(), LoginRequestDTO.class);
		
		UsernamePasswordAuthenticationToken token=new UsernamePasswordAuthenticationToken(loginRequest.getUsername(),
				loginRequest.getPassword());
		Authentication authresult=authenticationManager.authenticate(token);
		
		if(authresult.isAuthenticated()) {
			String tokens=jwtUtil.generateToken(loginRequest.getUsername(), 5);
			response.addHeader("Authorization", "Bearer "+ tokens);
			
		}
	}

}
