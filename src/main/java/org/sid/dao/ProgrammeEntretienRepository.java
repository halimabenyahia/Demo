package org.sid.dao;

import org.sid.entities.ProgrammeEntretien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProgrammeEntretienRepository extends JpaRepository<ProgrammeEntretien, Integer> {
	
//	@Query("from ProgrammeEntretien p where p.vehicule_entretien= '123tu1234' ")
//	public ProgrammeEntretien findbyVehicule();
	
//	@Query("from ProgrammeEntretien p where p.type_entretien = 1 ")
//	public ProgrammeEntretien findbyTypeEntr() ;

}
