package org.sid.web;

import java.util.List;

import org.sid.dao.VehiculeRepository;
import org.sid.entities.Vehicule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")

public class VehiculeRestService {
	
	@Autowired
	private VehiculeRepository vehiculeRep ;
	
	@RequestMapping(value="/vehicules",method=RequestMethod.GET)
	
	public List<Vehicule> getAllVehicule(){
		return vehiculeRep.findAll();
	}

	@RequestMapping(value="/vehiculeById/{id}",method=RequestMethod.GET)
	public Vehicule getByIdVehicule(@PathVariable Integer id){
		return vehiculeRep.findOne(id);
	}
	
	@RequestMapping(value="/addVehicule",method=RequestMethod.POST)
	public Vehicule addVehicule(@RequestBody Vehicule c){
		return vehiculeRep.save(c);
	}
	
	@RequestMapping(value="/deleteVehicule/{id}",method=RequestMethod.DELETE)
	public boolean deleteVehicule(@PathVariable Integer id){
		vehiculeRep.delete(id);
		 return true;
	}
	
	@RequestMapping(value="/editVehicules",method=RequestMethod.PUT)
	public Vehicule editVehicule(@RequestBody Vehicule c){
		
		 return vehiculeRep.save(c);
	
	}
	
	@RequestMapping(value="/vehiculebydepense",method=RequestMethod.GET)
	public Vehicule getbydepense() {
		return vehiculeRep.findByDepense();
	}

	
//	@RequestMapping(value="/halima",method=RequestMethod.GET)
//	public Vehicule getbyAssurance(){
//	 return vehiculeRep.findByAssurance();
//	}
//	
//	@RequestMapping(value="/halima2",method=RequestMethod.GET)
//	public Vehicule getVehicule1(){
//		 return vehiculeRep.findVehiculeByTypeBoite();
//	}
//	@RequestMapping(value="/halima3",method=RequestMethod.GET)
//	public Vehicule getVehicule3(){
//		 return vehiculeRep.findByEnergie();
//	}
//	@RequestMapping(value="/halima4",method=RequestMethod.GET)
//	public Vehicule getVehicule4(){
//		 return vehiculeRep.findByAffec();
//	}
//	@RequestMapping(value="/halima5",method=RequestMethod.GET)
//	public Vehicule getVehicule5(){
//		 return vehiculeRep.findByContrat();
//	}
//	@RequestMapping(value="/halima6",method=RequestMethod.GET)
//	public Vehicule getVehicule6(){
//		 return vehiculeRep.findByMarque();
//	}
//	@RequestMapping(value="/halima7",method=RequestMethod.GET)
//	public Vehicule getVehicule7(){
//		 return vehiculeRep.findbyModele();
//	}
//	@RequestMapping(value="/halima8",method=RequestMethod.GET)
//	public Vehicule getVehicule8(){
//		 return vehiculeRep.findBychauff();
//	}
//	@RequestMapping(value="/halima9",method=RequestMethod.GET)
//	public Vehicule getVehicule9(){
//		 return vehiculeRep.findbyDepense();
//	}
//	
//	@RequestMapping(value="/halima10",method=RequestMethod.GET)
//	public Vehicule getVehicule10(){
//		 return vehiculeRep.findbyProg();
//	}
//	
	
	

}
