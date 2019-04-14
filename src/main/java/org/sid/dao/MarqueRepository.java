package org.sid.dao;

import java.util.List;

import org.sid.entities.Marque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MarqueRepository extends JpaRepository<Marque, Integer> {
	
	
	@Query("select des_marque from Marque m where m.des_marque like :parametre")
	public List<Marque> findByParametreM(String parametre) ;
	
	
	
//	@Query("from Marque m where m.modele_m = 1 ")
//	public Marque findbyModele();

}
