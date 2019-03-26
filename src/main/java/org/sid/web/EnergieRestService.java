package org.sid.web;

import java.util.List;

import org.sid.dao.EnergieRepository;
import org.sid.entities.Energie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnergieRestService {
	
	@Autowired
	private EnergieRepository energieRep ;

	@RequestMapping(value="/energies",method=RequestMethod.GET)
	public List<Energie> getEnergie(){
		return energieRep.findAll();
	}

	@RequestMapping(value="/energieById/{id}",method=RequestMethod.GET)
	public Energie getEnergie(@PathVariable int id){
		return energieRep.findOne(id);
	}
	
	@RequestMapping(value="/addEnergie",method=RequestMethod.POST)
	public Energie save(@RequestBody Energie c){
		return energieRep.save(c);
	}
	
	@RequestMapping(value="/deleteEnergie",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable int id){
		energieRep.delete(id);
		 return true;
	}
	@RequestMapping(value="/editEnergie",method=RequestMethod.PUT)
	public Energie edit(@RequestBody Energie c){
		 return energieRep.save(c);
	}
	
	
}
