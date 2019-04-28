package org.sid.dao;

import org.sid.entities.User;

public interface IUserService {
	
	String signin(String login, String mdp);
	String signup(User user);

}
