package org.sid.dao;

import java.util.List;

import org.sid.entities.AffectationVehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AffectationVehiculeRepository extends JpaRepository<AffectationVehicule, Integer> {
	
	@Query("select m from AffectationVehicule m where m.des_affectation like :parametre")
	public List<AffectationVehicule> findByAffectationParam(@Param("parametre") String parametre) ;

}
