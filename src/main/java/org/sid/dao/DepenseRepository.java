package org.sid.dao;

import org.sid.entities.Depense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DepenseRepository extends JpaRepository<Depense, Integer> {
	
//	@Query("from Depense d where d.vehicule_depense = '123tu1234' ")
//	public Depense findByidimm();
//
//	@Query("from Depense d where d.fournisseur_d = 1 ")
//	public Depense findbyfour();
//	
//	@Query("from Depense d where d.piece_d = 1 ")
//	public Depense findByPiece();
//	
//	@Query("from Depense d where d.depense_carburant = 1 ")
//	public Depense findbydepCar();

}
