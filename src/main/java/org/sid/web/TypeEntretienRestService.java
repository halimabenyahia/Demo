package org.sid.web;

import java.util.List;

import org.sid.dao.TypeEntretienRepository;
import org.sid.entities.TypeEntretien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
public class TypeEntretienRestService {
	
	@Autowired
	private TypeEntretienRepository typeEntretienRep ;
	

	@RequestMapping(value="/typeEntretiens",method=RequestMethod.GET)
	public List<TypeEntretien> getAlltypeEntretiens(){
		return typeEntretienRep.findAll();
	}

	@RequestMapping(value="/typeEntretienById/{id}",method=RequestMethod.GET)
	public TypeEntretien getByIdTypeEntretien(@PathVariable int id){
		return typeEntretienRep.findOne(id);
	}
	
	@RequestMapping(value="/addTypeEntretien",method=RequestMethod.POST)
	public TypeEntretien addtypeEntretien(@RequestBody TypeEntretien c){
		return typeEntretienRep.save(c);
	}
	
	@RequestMapping(value="/deleteTypeEntretien/{id}",method=RequestMethod.DELETE)
	public boolean deleteTypeEntretien(@PathVariable int id){
		typeEntretienRep.delete(id);
		 return true;
	}
	
	@RequestMapping(value="/editTypeEntretien",method=RequestMethod.PUT)
	public TypeEntretien editTypeEntretien(@RequestBody TypeEntretien c){
		 return typeEntretienRep.save(c);
	}
	
}
