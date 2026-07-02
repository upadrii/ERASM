package com.project.ERASM.util;



import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Date;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import jakarta.servlet.http.HttpServletRequest;

@Component
public class JWTUtil {

    private static final String SECRET_KEY =
            "my-super-secret-jwt-security-key-for-springboot";

    private static final Key key =
            Keys.hmacShaKeyFor(
                    SECRET_KEY.getBytes(StandardCharsets.UTF_8)
            );

    // Generate Token
    public String generateToken(String username,
                                long expiryMinutes) {

        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(
                        new Date(
                                System.currentTimeMillis()
                                + expiryMinutes * 60 * 1000
                        )
                )
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }
    
    public String extractAndValidateToken(String token) {
    	try {
    		return Jwts.parser()
        			.setSigningKey(key)
        			.build()
        			.parseClaimsJws(token)
        			.getBody()
        			.getSubject();

    	}
    	catch (JwtException e) {
    		return null;
    	}
    	
    	
    }
}