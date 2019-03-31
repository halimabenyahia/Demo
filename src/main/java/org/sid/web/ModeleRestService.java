package org.sid.web;

import java.util.List;

import org.sid.dao.ModeleRepository;
import org.sid.entities.Modele;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
public class ModeleRestService {
	
	@Autowired
	private ModeleRepository modeleRep ;
	
	@RequestMapping(value="/modeles",method=RequestMethod.GET)
	public List<Modele> getModeles(){
		return modeleRep.findAll();
	}

	@RequestMapping(value="/modeleById/{id}",method=RequestMethod.GET)
	public Modele getModele(@PathVariable int id){
		return modeleRep.findOne(id);
	}
	
	@RequestMapping(value="/addModele",method=RequestMethod.POST)
	public Modele save(@RequestBody Modele c){
		return modeleRep.save(c);
	}
	
	@RequestMapping(value="/deleteModele/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable int id){
		modeleRep.delete(id);
		 return true;
	}
	
	@RequestMapping(value="/editModele",method=RequestMethod.PUT)
	public Modele edit(@RequestBody Modele c){
		 return modeleRep.save(c);
	}

}
