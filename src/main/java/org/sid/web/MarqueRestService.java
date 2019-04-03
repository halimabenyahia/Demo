package org.sid.web;

import java.util.List;

import org.sid.dao.MarqueRepository;
import org.sid.entities.Marque;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
public class MarqueRestService {
	
	
	@Autowired
	private MarqueRepository marqueRep ;
	
	@RequestMapping(value="/marques",method=RequestMethod.GET)
	public List<Marque> getMarques(){
		return marqueRep.findAll();
	}

	@RequestMapping(value="/marqueById/{id}",method=RequestMethod.GET)
	public Marque getMarques(@PathVariable int id){
		return marqueRep.findOne(id);
	}
	
	@RequestMapping(value="/addMarque",method=RequestMethod.POST)
	public Marque addMarque(@RequestBody Marque c){
		return marqueRep.save(c);
	}
	
	@RequestMapping(value="/deleteMarque/{id}",method=RequestMethod.DELETE)
	public boolean supprimerMarque(@PathVariable int id){
		marqueRep.delete(id);
		 return true;
	}
	
	@RequestMapping(value="/editMarque/{id}",method=RequestMethod.PUT)
	public Marque editMarque(@RequestBody Marque c){
		 return marqueRep.save(c);
	}
	
	@RequestMapping(value="/marqueByMo",method=RequestMethod.GET)
	public Marque getMarquesm(){
		return marqueRep.findbyModele();
	}

}
