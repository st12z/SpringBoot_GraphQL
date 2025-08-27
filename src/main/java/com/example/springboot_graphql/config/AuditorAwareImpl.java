package com.example.springboot_graphql.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.stereotype.Component;

import java.util.Optional;
@Component
public class AuditorAwareImpl implements AuditorAware<String> {

    @Autowired
    ApplicationContext context;
    @Override
    public Optional<String> getCurrentAuditor() {
        Authentication authentication = context.getBean(Authentication.class);
        if(authentication.isAuthenticated()) {
            return Optional.of(authentication.getName());
        }
        return Optional.empty();
    }
}
