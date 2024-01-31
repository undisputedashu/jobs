package com.example.jobs.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    @Order(1)
    SecurityFilterChain formLogin(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .authorizeRequests()
                .antMatchers("/user/**")
                .authenticated()
                .and()
                .formLogin(withDefaults())
//                .httpBasic(withDefaults()) we can use either form or basic auth
                .build();
    }

    @Bean
    @Order(2)
    SecurityFilterChain permitAll(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .authorizeRequests()
                .antMatchers("/", "/home")
                .permitAll()
                .and()
                .build();
    }
}
