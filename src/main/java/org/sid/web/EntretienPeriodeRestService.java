package org.sid.web;

import java.util.List;

import org.sid.dao.EntretienPeriodeRepository;
import org.sid.entities.EntretienPeriode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntretienPeriodeRestService {

	@Autowired
	private EntretienPeriodeRepository entretienPeriodeRep ;
	
	@RequestMapping(value="/entretienPeriodes",method=RequestMethod.GET)
	public List<EntretienPeriode> getAllEntretiensPeriode(){
		return entretienPeriodeRep.findAll();
	}

	@RequestMapping(value="/EntretienPeriodeById/{id}",method=RequestMethod.GET)
	public EntretienPeriode getByIdEntretienPeriode(@PathVariable int id){
		return entretienPeriodeRep.findOne(id);
	}
	
	@RequestMapping(value="/addEntretienPeriode",method=RequestMethod.POST)
	public EntretienPeriode addEntretienP(@RequestBody EntretienPeriode c){
		return entretienPeriodeRep.save(c);
	}
	
	@RequestMapping(value="/deleteEntretienP/{id}",method=RequestMethod.DELETE)
	public boolean deleteEntretienPeriode(@PathVariable int id){
		entretienPeriodeRep.delete(id);
		 return true;
	}
	
	@RequestMapping(value="/editEntretienPeriode",method=RequestMethod.PUT)
	public EntretienPeriode editEntretienP(@RequestBody EntretienPeriode c){
		 return entretienPeriodeRep.save(c);
	}
	
	
	
	
	
//	@RequestMapping(value="/EntretienPeriodeProg",method=RequestMethod.GET)
//	public EntretienPeriode getByIdEntretienPeriode1(){
//		return entretienPeriodeRep.findbyEntreP();
//	}
}