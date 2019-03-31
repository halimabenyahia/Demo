package org.sid.web;

import java.util.List;

import org.sid.dao.FournisseurRepository;
import org.sid.entities.Fournisseur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
public class FournisseurRestService {
	
	@Autowired
	private FournisseurRepository fournisseurRep ;
	
	@RequestMapping(value="/fournisseurs",method=RequestMethod.GET)
	public List<Fournisseur> getFournisseur(){
		return fournisseurRep.findAll();
	}

	@RequestMapping(value="/fournisseur/{id}",method=RequestMethod.GET)
	public Fournisseur getFournisseur(@PathVariable int id){
		return fournisseurRep.findOne(id);
	}
	
	@RequestMapping(value="/addFournisseur",method=RequestMethod.POST)
	public Fournisseur save(@RequestBody Fournisseur c){
		return fournisseurRep.save(c);
	}
	
	@RequestMapping(value="/deleteFournisseur/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable int id){
		fournisseurRep.delete(id);
		 return true;
	}
	
	@RequestMapping(value="/editFournisseur",method=RequestMethod.PUT)
	public Fournisseur edit(@RequestBody Fournisseur c){
		 return fournisseurRep.save(c);
	}
	

}
