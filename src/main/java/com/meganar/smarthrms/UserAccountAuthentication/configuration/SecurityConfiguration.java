package com.meganar.smarthrms.UserAccountAuthentication.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.meganar.smarthrms.UserAccountAuthentication.service.CustomUserDetailsService;

import jakarta.annotation.security.PermitAll;

@Configuration
public class SecurityConfiguration {
	@Autowired
	private DataSource dataSource;

	@Bean
	public UserDetailsService userDetailsService() {
		return new CustomUserDetailsService();
	}

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
		authProvider.setUserDetailsService(userDetailsService());
		authProvider.setPasswordEncoder(passwordEncoder());

		return authProvider;
	}


	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(authenticationProvider());
	}

	@Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.csrf()
            .disable()
            .authorizeHttpRequests()
            .requestMatchers("/users")
            .permitAll()
            .anyRequest()
            .authenticated()
            .and()
			.formLogin()
			.loginPage("/login")
			.usernameParameter("email")
			//.loginProcessingUrl("/perform_login")
			.defaultSuccessUrl("/dashboard", true)
			.permitAll()
			//.failureUrl("/login.html?error=true")
			.and()
			.logout()

			.deleteCookies("JSESSIONID");
			return http.build();
	}


}
