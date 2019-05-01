package org.sid.service;

import java.util.ArrayList;
import java.util.Arrays;

import org.sid.config.CustomException;
import org.sid.config.JwtTokenProvider;
import org.sid.dao.IUserService;
import org.sid.dao.UserRepository;
import org.sid.entities.Role;
import org.sid.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private UserRepository userRep ;
	
	@Autowired
	private JwtTokenProvider jwtTokenProvider ;
	
	@Bean
	public JwtTokenProvider jwtTokenProvider() {
		return jwtTokenProvider;
	}
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Bean
	public AuthenticationManager authenticationManager() {
		return authenticationManager;
	}
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return passwordEncoder;
		
	}

	@Override
	public String signin(String login, String mdp) {
		try {
		      authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(login, mdp));
		      return jwtTokenProvider.createToken(login, userRep.findByUsername(login).getRoles());
		    } catch (AuthenticationException e) {
		      throw new CustomException("Invalid username/password supplied **",HttpStatus.UNPROCESSABLE_ENTITY);
		    }
	}

	@Override
	public String signup(User user) {
		if (!userRep.existsByLogin(user.getLogin())) {
		      user.setMdp(passwordEncoder.encode(user.getMdp()));
		      user.setRoles(new ArrayList<Role>(Arrays.asList(Role.ROLE_AGENT)));
		      userRep.save(user);
		      return jwtTokenProvider.createToken(user.getLogin(), user.getRoles());
		    } else {
		      throw new CustomException("login is already in use", HttpStatus.UNPROCESSABLE_ENTITY);
		    }
	}

}
