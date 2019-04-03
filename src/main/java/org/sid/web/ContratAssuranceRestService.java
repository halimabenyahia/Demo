package org.sid.web;

import java.util.List;

import org.sid.dao.ContratAssuranceRepository;
import org.sid.entities.ContratAssurance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
public class ContratAssuranceRestService {
	
	@Autowired
	private ContratAssuranceRepository contratAssRep;
	
	@RequestMapping(value="/contratAssurance",method=RequestMethod.GET)
	public List<ContratAssurance> getContratAss(){
		return contratAssRep.findAll();
	}

	@RequestMapping(value="/contratAssrance/{id}",method=RequestMethod.GET)
	public ContratAssurance getContratAss(@PathVariable int id){
		return contratAssRep.findOne(id);
	}
	
	@RequestMapping(value="/addContrat",method=RequestMethod.POST)
	public ContratAssurance addContrat(@RequestBody ContratAssurance c){
		return contratAssRep.save(c);
	}
	
	@RequestMapping(value="/deleteContratAss/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable int id){
		contratAssRep.delete(id);
		 return true;
	}
	
	@RequestMapping(value="/editcontrat/{id}",method=RequestMethod.PUT)
	public ContratAssurance editContrat(@RequestBody ContratAssurance c){
		 return contratAssRep.save(c);
	}
	
	@RequestMapping(value="/halimaCAss",method=RequestMethod.GET)
	public ContratAssurance getcontrat(){
		 return contratAssRep.findbyass();
	}
	

}
