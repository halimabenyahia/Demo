package org.sid.dao;

import org.sid.entities.Marque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MarqueRepository extends JpaRepository<Marque, Integer> {
	
	@Query("from Marque m where m.modele_m = 1 ")
	public Marque findbyModele();

}
