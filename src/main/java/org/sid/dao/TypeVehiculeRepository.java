package org.sid.dao;

import java.util.List;

import org.sid.entities.TypeVehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TypeVehiculeRepository extends JpaRepository<TypeVehicule, Integer> {
	
	@Query("select m from TypeVehicule m where m.des_typeVehicule like :parametre")
	public List<TypeVehicule> findByTypeVehiculeParam(@Param("parametre") String parametre) ;

}
