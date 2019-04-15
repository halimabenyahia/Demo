package org.sid.dao;

import java.util.List;

import org.sid.entities.Chauffeurs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ChauffeursRepository extends JpaRepository<Chauffeurs, Integer> {
	
	
	@Query("select m from Chauffeurs m where m.nom_ch like :parametre")
	public List<Chauffeurs> findByParametreChauffeur(@Param("parametre") String parametre) ;

}
