package com.netlink.auth.authenticateservice.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableWebSecurity
@Configuration                         // to execute it first
public class AppConfig {

        @Bean
        public UserDetailsService userDetailsService()       // to create customize users with roles
        {
            UserDetails user= User
                    .builder()
                    .username("adil")
                    .password(passwordEncoder().encode("adil"))
                    .roles("USER")
                    .build();

            UserDetails admin= User
                    .builder()
                    .username("admin")
                    .password(passwordEncoder().encode("admin"))
                    .roles("ADMIN")
                    .build();
            return new InMemoryUserDetailsManager(user,admin);
        }
        @Bean
        public PasswordEncoder passwordEncoder()
        {
            return new BCryptPasswordEncoder();
        }
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration builder) throws Exception {
        return builder.getAuthenticationManager();
    }
//        @Bean
//        public AuthenticationProvider authenticationProvider()                // to connect with DB
//        {
//            DaoAuthenticationProvider provider= new DaoAuthenticationProvider();
//            return provider;
//        }
}
