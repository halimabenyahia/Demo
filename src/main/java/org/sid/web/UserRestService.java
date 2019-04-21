package org.sid.web;

import java.util.List;

import org.sid.dao.UserRepository;
import org.sid.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
public class UserRestService {
	
	@Autowired
	private UserRepository userRep ;
	
	@RequestMapping(value="/users",method=RequestMethod.GET)
	public List<User> getAllUser(){
		return userRep.findAll();
	}

	@RequestMapping(value="/userById/{id}",method=RequestMethod.GET)
	public User getUserById(@PathVariable int id){
		return userRep.findOne(id);
	}
	
	@RequestMapping(value="/addUser",method=RequestMethod.POST)
	public User addUser(@RequestBody User c){
		return userRep.save(c);
	}
	
	@RequestMapping(value="/deleteUser/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable int id){
		userRep.delete(id);
		 return true;
	}
	
	@RequestMapping(value="/editUser",method=RequestMethod.PUT)
	public User edit(@RequestBody User c){
		 return userRep.save(c);
	}
	
	@RequestMapping(value="/etat/{login} {mdp}",method=RequestMethod.GET)
	public boolean getetatUser(@PathVariable String login,@PathVariable String mdp){
		boolean flag=false;
		try{User u=userRep.findUserSingleResult(login, mdp); System.out.print(u.getId_user());flag=true;}catch(Exception e) {flag=false;}
		
	return flag;	 
	}
	
	@RequestMapping(value="/findbyname/{parametre}" , method=RequestMethod.GET)
	public List<User> getUserbyName (@PathVariable String parametre){
		return userRep.findByUsername(parametre);
	}

}
