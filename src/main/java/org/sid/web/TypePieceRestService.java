package org.sid.web;

import java.util.List;

import org.sid.dao.TypePieceRepository;
import org.sid.entities.TypePiece;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TypePieceRestService {
	
	@Autowired
	private TypePieceRepository typePieceRep ;
	
	@RequestMapping(value="/typepieces",method=RequestMethod.GET)
	public List<TypePiece> getAllTypePiece(){
		return typePieceRep.findAll();
	}

	@RequestMapping(value="/TypepieceById/{id}",method=RequestMethod.GET)
	public TypePiece getByIdtypePiece(@PathVariable int id){
		return typePieceRep.findOne(id);
	}
	
	@RequestMapping(value="/addTypePiece",method=RequestMethod.POST)
	public TypePiece addTypePiece(@RequestBody TypePiece c){
		return typePieceRep.save(c);
	}
	
	@RequestMapping(value="/deleteTypePiece/{id}",method=RequestMethod.DELETE)
	public boolean deletetypePiece(@PathVariable int id){
		typePieceRep.delete(id);
		 return true;
	}
	
	@RequestMapping(value="/editTypePiece",method=RequestMethod.PUT)
	public TypePiece edittypePiece(@RequestBody TypePiece c){
		 return typePieceRep.save(c);
	}
	

}
