package org.sid.dao;

import java.util.Optional;

import org.sid.entities.Role;
import org.sid.entities.RoleUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleUserRepository extends JpaRepository<RoleUser, Integer> {
	
	
	Optional<RoleUser> findByName(Role roleName);

}
