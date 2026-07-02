package com.project.ERASM.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.project.ERASM.entities.Role;
import com.project.ERASM.repository.RoleRepository;

@Component
public class RoleSeeder implements CommandLineRunner {

    private static final Logger logger =
            LoggerFactory.getLogger(RoleSeeder.class);

    private final RoleRepository roleRepository;

    public RoleSeeder(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public void run(String... args) {

    	seedRole("ROLE_ADMIN");
    	seedRole("ROLE_DELIVERY_MANAGER");
    	seedRole("ROLE_RESOURCE_MANAGER");
    	seedRole("ROLE_EMPLOYEE");
    	seedRole("ROLE_AUDITOR");
        logger.info("Default roles initialized successfully.");
    }

    private void seedRole(String roleName) {

        if (!roleRepository.existsByRoleName(roleName)) {

            Role role = new Role();
            role.setRoleName(roleName);

            roleRepository.save(role);

            logger.info("{} role created.", roleName);
        }
    }
}