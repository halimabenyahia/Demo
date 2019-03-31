package org.sid.web;

import java.util.List;

import org.sid.dao.TypeBoiteRepository;
import org.sid.entities.TypeBoite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
public class TypeBoiteRestService {
	
	@Autowired
	private TypeBoiteRepository typeBoiteRep ;
	
	@RequestMapping(value="/typeBoites",method=RequestMethod.GET)
	public List<TypeBoite> getTypeBoite(){
		return typeBoiteRep.findAll();
	}

	@RequestMapping(value="/typeBoiteById/{id}",method=RequestMethod.GET)
	public TypeBoite getTypeBoite(@PathVariable int id){
		return typeBoiteRep.findOne(id);
	}
	
	@RequestMapping(value="/addtypeBoite",method=RequestMethod.POST)
	public TypeBoite save(@RequestBody TypeBoite c){
		return typeBoiteRep.save(c);
	}
	
	@RequestMapping(value="/deleteTypeBoite/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable int id){
		typeBoiteRep.delete(id);
		 return true;
	}
	
	@RequestMapping(value="/editTypeBoite",method=RequestMethod.PUT)
	public TypeBoite edit(@RequestBody TypeBoite c){
		 return typeBoiteRep.save(c);
	}

}
