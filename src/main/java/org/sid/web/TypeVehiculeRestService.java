package org.sid.web;

import java.util.List;

import org.sid.dao.TypeVehiculeRepository;
import org.sid.entities.TypeVehicule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TypeVehiculeRestService {
	
	@Autowired
	private TypeVehiculeRepository typeVehiculeRep ;
	
	@RequestMapping(value="/typeVehicules",method=RequestMethod.GET)
	public List<TypeVehicule> getTypeVehicule(){
		return typeVehiculeRep.findAll();
	}

	@RequestMapping(value="/typeVehiculeById/{id}",method=RequestMethod.GET)
	public TypeVehicule getEnergie(@PathVariable int id){
		return typeVehiculeRep.findOne(id);
	}
	
	@RequestMapping(value="/addtypeVehicule",method=RequestMethod.POST)
	public TypeVehicule save(@RequestBody TypeVehicule c){
		return typeVehiculeRep.save(c);
	}
	
	@RequestMapping(value="/deleteTypeVehicule/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable int id){
		typeVehiculeRep.delete(id);
		 return true;
	}
	
	@RequestMapping(value="/editTypeVehicule",method=RequestMethod.PUT)
	public TypeVehicule edittypeVehicule(@RequestBody TypeVehicule c){
		 return typeVehiculeRep.save(c);
	}
	

}