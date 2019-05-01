package org.sid.web;

import java.util.List;

import org.sid.dao.ChauffeursRepository;
import org.sid.entities.Chauffeurs;
import org.sid.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*", allowedHeaders = "*")
public class ChauffeursRestService {
	
	@Autowired
	private ChauffeursRepository chauffRep;
	
	@RequestMapping(value="/chauffeurs",method=RequestMethod.GET)
	public List<Chauffeurs> getChauffeurs(){
		return chauffRep.findAll();
	}

	@RequestMapping(value="/chauffeurById/{id}",method=RequestMethod.GET)
	public Chauffeurs getChauffeursById(@PathVariable int id){
		return chauffRep.findOne(id);
	}
	
	@RequestMapping(value="/addChauffeur",method=RequestMethod.POST)
	public Chauffeurs addChauffeur(@RequestBody Chauffeurs c){
		return chauffRep.save(c);
	}
	
	@RequestMapping(value="/deleteChauffeur/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable int id){
		chauffRep.delete(id);
		 return true;
	}
	
	@RequestMapping(value="/editChauffeur",method=RequestMethod.PUT)
	public Chauffeurs edit(@RequestBody Chauffeurs c){
		 return chauffRep.save(c);
	}
	
	@RequestMapping(value="/chauffeurByParam/{parametre}",method=RequestMethod.GET)
	public Chauffeurs getChauffeurParam(@PathVariable String parametre){
		return chauffRep.findByParametreChauffeur("%"+parametre+"%");
	}
	
	@RequestMapping(value="/chauffeurBynom/{parametre}",method=RequestMethod.GET)
	public Chauffeurs getChauffeurbynom(@PathVariable String parametre){
		return chauffRep.findBynomChauffeur(parametre);
	}
	
//	@RequestMapping(value="/findbymatricule/{parametre}" , method=RequestMethod.GET)
//	public List<Chauffeurs> getUserbyMatricule (@PathVariable String parametre){
//		return chauffRep.findByMatricule(parametre);
//	}

}
