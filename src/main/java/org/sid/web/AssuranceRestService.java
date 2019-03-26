package org.sid.web;

import java.util.List;

import org.sid.dao.AssuranceRepository;
import org.sid.entities.Assurance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AssuranceRestService {
	
	@Autowired
	private AssuranceRepository assuranceRep ;
	
	@RequestMapping(value="/Assurance",method=RequestMethod.GET)
	public List<Assurance> getAssurrance(){
		return assuranceRep.findAll();
	}

	@RequestMapping(value="/Assurance/{id}",method=RequestMethod.GET)
	public Assurance getAssurance(@PathVariable int id){
		return assuranceRep.findOne(id);
	}
	
	@RequestMapping(value="/addAssurance",method=RequestMethod.POST)
	public Assurance save(@RequestBody Assurance c){
		return assuranceRep.save(c);
	}
	
	@RequestMapping(value="/deleteAssurance/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable int id){
		assuranceRep.delete(id);
		 return true;
	}
	
	@RequestMapping(value="/editAssurance/{id}",method=RequestMethod.PUT)
	public Assurance edit(@RequestBody Assurance c){
		 return assuranceRep.save(c);
	}

}