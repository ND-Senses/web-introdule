//package vn.ndm.webintrodule.config;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.DefaultSecurityFilterChain;
//import org.springframework.security.web.SecurityFilterChain;
//
//import java.util.Arrays;
//import java.util.Collections;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//    @Bean
//    public UserDetailsService userDetailsService() {
//        return new InMemoryUserDetailsManager(
//                new User("user", "password", Collections.singletonList(new SimpleGrantedAuthority("ROLE_USER")))
//        );
//    }
//
//    @Bean
//    public AuthenticationManager authenticationManagerBean() throws Exception {
//        return new AuthenticationManagerBuilder(userDetailsService())
//                .build();
//    }
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(AuthenticationManager authenticationManager) {
//        return new DefaultSecurityFilterChain(
//                new HttpSecurity(authenticationManager)
//                        .authorizeRequests()
//                        .antMatchers("/", "/home").permitAll()
//                        .anyRequest().authenticated()
//                        .and()
//                        .formLogin()
//                        .and()
//                        .httpBasic()
//        );
//    }
//}
//
