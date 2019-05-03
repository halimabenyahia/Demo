package org.sid;

import java.util.ArrayList;
import java.util.Arrays;

import org.sid.entities.Role;
import org.sid.entities.User;
import org.sid.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	
	@Autowired
	UserService userService ;

    
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	  public void run(String... params) throws Exception {
//	    User admin = new User();
//	    admin.setLogin("admin");
//	    admin.setMdp("admin");
//	    admin.setEtat_admin(true);;
//	    admin.setRoles(new ArrayList<Role>(Arrays.asList(Role.ROLE_ADMIN)));
//
//	    userService.signup(admin);
//
//	    User agent = new User();
//	    agent.setLogin("agent1");
//	    agent.setMdp("agent");
//	    agent.setEtat_admin(false);
//	    agent.setRoles(new ArrayList<Role>(Arrays.asList(Role.ROLE_AGENT)));
//
//	    userService.signup(agent);
	  }
	


	
}
