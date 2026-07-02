package com.project.ERASM.auth.controller;

import com.project.ERASM.auth.service.UserService;
import com.project.ERASM.dto.request.LoginRequestDTO;
import com.project.ERASM.dto.request.RegisterRequestDTO;
import com.project.ERASM.dto.response.LoginResponseDTO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private static final Logger logger = LoggerFactory.getLogger(AuthController.class);

    private final UserService userService;
    private final AuthenticationManager authenticationManager;

    public AuthController(UserService userService,
                          AuthenticationManager authenticationManager) {
        this.userService = userService;
        this.authenticationManager = authenticationManager;
    }

    @PostMapping("/register")
    public ResponseEntity<LoginResponseDTO> register(@RequestBody RegisterRequestDTO request) {
        return ResponseEntity.ok(userService.register(request));
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDTO> login(@RequestBody LoginRequestDTO request) {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            request.getUsername(),
                            request.getPassword()
                    )
            );
            logger.info("User Login: Successful login for username: {}", request.getUsername());
        } catch (AuthenticationException e) {
            logger.warn("Unauthorized Access: Failed login attempt for username: {}", request.getUsername());
            throw e;
        }

        return ResponseEntity.ok(
                userService.generateLoginResponse(request.getUsername())
        );
    }

    @PostMapping("/logout")
    public ResponseEntity<String> logout() {
        return ResponseEntity.ok("Logged out successfully");
    }

    @PostMapping("/change-password")
    public ResponseEntity<String> changePassword(@RequestParam String newPassword, java.security.Principal principal) {
        if (principal == null) {
            logger.warn("Unauthorized Access: Attempt to change password without credentials");
            return ResponseEntity.status(401).body("Unauthorized");
        }
        userService.changePassword(principal.getName(), newPassword);
        return ResponseEntity.ok("Password changed successfully");
    }
}