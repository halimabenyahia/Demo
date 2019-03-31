package org.sid.web;

import java.util.List;

import org.sid.dao.ProgrammeEntretienRepository;
import org.sid.entities.ProgrammeEntretien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
public class ProgrammeEntretienRestService {
	
	@Autowired
	private ProgrammeEntretienRepository progEntreRep  ;
	
	
	@RequestMapping(value="/programmeEntretiens",method=RequestMethod.GET)
	public List<ProgrammeEntretien> getProgEntretiens(){
		return progEntreRep.findAll();
	}

	@RequestMapping(value="/programmeEntretiens/{id}",method=RequestMethod.GET)
	public ProgrammeEntretien getProgEntretiens(@PathVariable int id){
		return progEntreRep.findOne(id);
	}
	
	@RequestMapping(value="/addProgramme",method=RequestMethod.POST)
	public ProgrammeEntretien addProgramme(@RequestBody ProgrammeEntretien c){
		return progEntreRep.save(c);
	}
	
	@RequestMapping(value="/deleteProgrammeEnt/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable int id){
		progEntreRep.delete(id);
		 return true;
	}
	
	@RequestMapping(value="/editProgramEnt",method=RequestMethod.PUT)
	public ProgrammeEntretien edit(@RequestBody ProgrammeEntretien c){
		 return progEntreRep.save(c);
	}
	
	
//	@RequestMapping(value="/programmeEntretienbyV",method=RequestMethod.GET)
//	public ProgrammeEntretien getProgEntretiensV(){
//		return progEntreRep.findbyVehicule();
//	}
//
//	@RequestMapping(value="/programmeEntretienbyTy",method=RequestMethod.GET)
//	public ProgrammeEntretien getProgEntretiensTE(){
//		return progEntreRep.findbyTypeEntr();
//	}
}
