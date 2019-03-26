package org.sid.dao;

import org.sid.entities.SortieStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SortieStockRepository extends JpaRepository<SortieStock, Integer> {
	
//	@Query("from SortieStock s where s.vehicule_sortie= '123tu1234' ")
//	public SortieStock findbyV();

}
