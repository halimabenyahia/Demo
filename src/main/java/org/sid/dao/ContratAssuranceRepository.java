package org.sid.dao;

import org.sid.entities.ContratAssurance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ContratAssuranceRepository extends JpaRepository<ContratAssurance, Integer> {
	
	@Query("from ContratAssurance c where c.assurance_c = 1 ")
	public ContratAssurance findbyass();

}
