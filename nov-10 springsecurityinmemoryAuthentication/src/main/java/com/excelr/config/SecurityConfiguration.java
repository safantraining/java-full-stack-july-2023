package com.excelr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {


	@Bean
    public static PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
   
	
	/*
	 *   HttpSecurity , here it will configuration the api based on user roles
	 */
	
	@Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf().disable().authorizeHttpRequests((authorize) -> {
            authorize.requestMatchers("viewproduct").hasRole("USER");
            authorize.requestMatchers(HttpMethod.GET, "addproduct").hasRole("ADMIN");
            authorize.requestMatchers(HttpMethod.GET, "offers").hasAnyRole("USER","ADMIN")
             .anyRequest().authenticated();
       
        
        }).httpBasic(Customizer.withDefaults());
        return http.build();
    }
   
	
	
	
	
	
	@Bean
    public UserDetailsService userDetailsService() {
        
        UserDetails peter = User.builder().username("peter").password(passwordEncoder().encode("peter@123")).roles("USER") .build();
        
        UserDetails admin = User.builder().username("admin").password(passwordEncoder().encode("admin")).roles("ADMIN").build();
        
      
      
        return new InMemoryUserDetailsManager(peter,admin);
    }

}
