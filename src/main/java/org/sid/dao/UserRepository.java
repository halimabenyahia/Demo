package org.sid.dao;

import org.sid.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	@Query("select u from User u where u.login = :login and u.mdp = :mdp ")
	public User findUserSingleResult(@Param("login") String login,@Param("mdp") String mdp);

}
