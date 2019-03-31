package org.sid.web;

import java.util.List;

import org.sid.dao.EntretienFrequenceRepository;
import org.sid.entities.EntretienFrequence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
public class EntretienFrequenceRestService {
	
	@Autowired
	private EntretienFrequenceRepository entretienFreqRep ;
	
	@RequestMapping(value="/entretienFrequence",method=RequestMethod.GET)
	public List<EntretienFrequence> getAllEntretiensfrequence(){
		return entretienFreqRep.findAll();
	}

	@RequestMapping(value="/EntretienFrequenceById/{id}",method=RequestMethod.GET)
	public EntretienFrequence getByIdEntretienFreq(@PathVariable int id){
		return entretienFreqRep.findOne(id);
	}
	
	@RequestMapping(value="/addEntretienFreq",method=RequestMethod.POST)
	public EntretienFrequence addEntretienFreq(@RequestBody EntretienFrequence c){
		return entretienFreqRep.save(c);
	}
	
	@RequestMapping(value="/deleteEntretienFreq/{id}",method=RequestMethod.DELETE)
	public boolean deleteEntretienFreq(@PathVariable int id){
		entretienFreqRep.delete(id);
		 return true;
	}
	
	@RequestMapping(value="/editEntretienFreq",method=RequestMethod.PUT)
	public EntretienFrequence editEntretienFreq(@RequestBody EntretienFrequence c){
		 return entretienFreqRep.save(c);
	}
	
//	@RequestMapping(value="/EntretienFreqprog",method=RequestMethod.GET)
//	public EntretienFrequence getByIdEntretienFreqPro(){
//		return entretienFreqRep.findbyprogFreq();
//	}
//	

}
