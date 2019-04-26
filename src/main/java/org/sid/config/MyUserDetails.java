package org.sid.config;

import org.sid.dao.UserRepository;
import org.sid.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class MyUserDetails implements UserDetailsService {
	
	@Autowired
	private UserRepository userRep ;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		final User user = userRep.findByUsername(username).get(0);
		if (user == null) {
		      throw new UsernameNotFoundException("login '" + username + "' not found");
		    }
		return org.springframework.security.core.userdetails.User//
		        .withUsername(username)//
		        .password(user.getMdp())//
		        .authorities(user.getRoles())//
		        .accountExpired(false)//
		        .accountLocked(false)//
		        .credentialsExpired(false)//
		        .disabled(false)//
		        .build();
		  }

}
