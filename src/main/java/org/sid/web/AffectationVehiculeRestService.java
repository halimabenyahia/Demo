package org.sid.web;

import java.util.List;

import org.sid.dao.AffectationVehiculeRepository;
import org.sid.entities.AffectationVehicule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AffectationVehiculeRestService {
	
	@Autowired
	private AffectationVehiculeRepository affectationVehiculeRep ;
	
	
	@RequestMapping(value="/affectations",method=RequestMethod.GET)
	public List<AffectationVehicule> getAffectation(){
		return affectationVehiculeRep.findAll();
	}

	@RequestMapping(value="/affectationById/{id}",method=RequestMethod.GET)
	public AffectationVehicule getAffectation(@PathVariable int id){
		return affectationVehiculeRep.findOne(id);
	}
	
	@RequestMapping(value="/addAffectation",method=RequestMethod.POST)
	public AffectationVehicule save(@RequestBody AffectationVehicule c){
		return affectationVehiculeRep.save(c);
	}
	
	@RequestMapping(value="/deleteAffectation/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable int id){
		affectationVehiculeRep.delete(id);
		 return true;
	}
	
	@RequestMapping(value="/editAffectation",method=RequestMethod.PUT)
	public AffectationVehicule editAffectation(@RequestBody AffectationVehicule c){
		 return affectationVehiculeRep.save(c);
	}



}
