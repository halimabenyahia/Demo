package org.sid.web;

import java.util.List;

import org.sid.dao.ChauffeursRepository;
import org.sid.entities.Chauffeurs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChauffeursRestService {
	
	@Autowired
	private ChauffeursRepository chauffRep;
	
	@RequestMapping(value="/chauffeurs",method=RequestMethod.GET)
	public List<Chauffeurs> getChauffeurs(){
		return chauffRep.findAll();
	}

	@RequestMapping(value="/chauffeurById/{id}",method=RequestMethod.GET)
	public Chauffeurs getChauffeurs(@PathVariable int id){
		return chauffRep.findOne(id);
	}
	
	@RequestMapping(value="/addChauffeur",method=RequestMethod.POST)
	public Chauffeurs save(@RequestBody Chauffeurs c){
		return chauffRep.save(c);
	}
	
	@RequestMapping(value="/deleteChauffeur/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable int id){
		chauffRep.delete(id);
		 return true;
	}
	
	@RequestMapping(value="/editChauffeur/{id}",method=RequestMethod.PUT)
	public Chauffeurs edit(@RequestBody Chauffeurs c){
		 return chauffRep.save(c);
	}

}
