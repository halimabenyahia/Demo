package org.sid.dao;

import java.util.List;

import org.sid.entities.Energie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EnergieRepository extends JpaRepository<Energie, Integer> {

	
	@Query("select m from Energie m where m.des_energie like :parametre")
	public List<Energie> findByParametreEnergie(@Param("parametre") String parametre) ;
}
