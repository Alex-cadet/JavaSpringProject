// package com.example.demo.lab4;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.core.authority.SimpleGrantedAuthority;
// import org.springframework.security.core.userdetails.User;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.security.provisioning.InMemoryUserDetailsManager;
// import org.springframework.security.web.SecurityFilterChain;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

// @Configuration
// public class SecurityConfiguration {
//     @Bean
//     public PasswordEncoder passwordEncoder() {
//     return new BCryptPasswordEncoder();
//     }

//     @Bean
//     public UserDetailsService userDetailsService(PasswordEncoder encoder) {
//     List<UserDetails> usersList = new ArrayList<>();
//     usersList.add(new User("--", encoder.encode("++"),    Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"))));
//     usersList.add(new User("woody", encoder.encode("password"),Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"))));
//     return new InMemoryUserDetailsManager(usersList);
//     }

//     @Bean
// public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
// return http
// .authorizeHttpRequests()
// .requestMatchers("/login")
// .hasRole("admin")
// .and()
// .formLogin()
// .loginPage("/login")
// .permitAll()
// .defaultSuccessUrl("/cinema")
// .and()
// .build();
// }
// }