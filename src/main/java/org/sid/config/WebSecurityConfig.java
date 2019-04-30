package org.sid.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	  private JwtTokenProvider jwtTokenProvider;
	
	@Bean
	  public CorsConfigurationSource corsConfigurationSource() {
	      final CorsConfiguration configuration = new CorsConfiguration();
	      configuration.setAllowedOrigins(Arrays.asList("*"));
	      configuration.setAllowedMethods(Arrays.asList("HEAD",
	              "GET", "POST", "PUT", "DELETE", "PATCH"));
	      configuration.setAllowCredentials(true);
	      configuration.setAllowedHeaders(Arrays.asList("Authorization", "Cache-Control", "Content-Type"));
	      final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	      source.registerCorsConfiguration("/**", configuration);
	      return source;
	  }
	
	
	@Override
	  protected void configure(HttpSecurity http) throws Exception {
	    //don't create session  
		http.csrf().disable();
		  http.cors();
	    // No session will be created or used by spring security
	    http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	    http.authorizeRequests()//
	        .antMatchers("/signin").permitAll()//
	        .antMatchers("/signup").permitAll()
	    //    .antMatchers("/utilisateurs/checkMail").permitAll()//
	        .antMatchers("/users/create").permitAll()//
	       //  Disallow everything else..
	        .anyRequest().authenticated();

	    // If a user try to access a resource without having enough permissions
	    //http.exceptionHandling().accessDeniedPage("/login");

	    // Apply JWT
	    http.apply(new JwtTokenFilterConfigurer(jwtTokenProvider));
	  }
	
	 @Bean
	  public PasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder(12);
	  }
	  
	  @Bean(name = BeanIds.AUTHENTICATION_MANAGER)
	  @Override
	  public AuthenticationManager authenticationManagerBean() throws Exception {
	      return super.authenticationManagerBean();
	  }

}
