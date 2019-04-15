package org.sid.dao;

import java.util.List;

import org.sid.entities.Modele;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ModeleRepository extends JpaRepository<Modele, Integer> {
	
	@Query("select m from Modele m where m.des_modele like :parametre")
	public List<Modele> findByParamModel(@Param("parametre") String parametre) ;

}
