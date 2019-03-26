package org.sid.dao;

import org.sid.entities.EntretienPeriode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EntretienPeriodeRepository extends JpaRepository<EntretienPeriode, Integer> {
	
//	@Query ("from EntretienPeriode e where e.programme_ent_p = 1 ")
//	public EntretienPeriode findbyEntreP();

}
