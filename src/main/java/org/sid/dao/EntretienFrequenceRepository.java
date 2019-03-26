package org.sid.dao;

import org.sid.entities.EntretienFrequence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EntretienFrequenceRepository extends JpaRepository<EntretienFrequence, Integer> {
	
	
//	@Query("from EntretienFrequence f where f.programme_ent_freq = 1 ")
//	public EntretienFrequence findbyprogFreq() ;

}
