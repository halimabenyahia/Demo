package org.sid.web;

import java.util.List;

import org.sid.dao.EntreeStockRepository;
import org.sid.entities.EntreeStock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntreeStockRestService {
	
	@Autowired
	private EntreeStockRepository entreeStockRep ;
	
	@RequestMapping(value="/entreeStocks",method=RequestMethod.GET)
	public List<EntreeStock> getAllEntreestock(){
		return entreeStockRep.findAll();
	}

	@RequestMapping(value="/entreeStockById/{id}",method=RequestMethod.GET)
	public EntreeStock getByIdEntreestock(@PathVariable int id){
		return entreeStockRep.findOne(id);
	}
	
	@RequestMapping(value="/addEntreeStock",method=RequestMethod.POST)
	public EntreeStock addEntreStock(@RequestBody EntreeStock c){
		return entreeStockRep.save(c);
	}
	
	@RequestMapping(value="/deleteEntreStock/{id}",method=RequestMethod.DELETE)
	public boolean deleteVehicule(@PathVariable int id){
		entreeStockRep.delete(id);
		 return true;
	}
	
	@RequestMapping(value="/editEntreeStock",method=RequestMethod.PUT)
	public EntreeStock editEntreStock(@RequestBody EntreeStock c){
		 return entreeStockRep.save(c);
	}

}
