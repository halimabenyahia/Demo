
package org.sid.web;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.sid.dao.UserRepository;
import org.sid.entities.User;
import org.sid.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@RestController
@RequestMapping("/users")
@CrossOrigin(origins="*")
public class UserRestService {
	
	@Autowired
	private UserRepository userRep ;
	
	@Autowired
	private UserService userService;
	
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
	public User getUserbyName (@PathVariable String parametre){
		return userRep.findByUsername(parametre);
	}
	
//	@RequestMapping(value="/signin" , method=RequestMethod.POST)
//	public Map<String,String> login( @RequestParam String login, @RequestParam String mdp) {
//		    return Collections.singletonMap("token", userService.signin(login, mdp));
//		  }
//	
//	
//	@RequestMapping(value="/signup" , method=RequestMethod.POST)
//	public ResponseEntity<Map<String, String>> signup( @RequestBody User user) {
//		return new ResponseEntity<Map<String,String>>(Collections.singletonMap("token", userService.signup(user)),HttpStatus.OK);
//		  }
	
	
	@PostMapping("/signin")
	@ApiOperation(value = "${UserRestService.signin}")
	@ApiResponses(value = {@ApiResponse(code = 400, message = "Something went wrong"),@ApiResponse(code = 422, message = "Invalid username/password supplied")})
	public String login(@RequestParam String login,@RequestParam String mdp) {
		System.out.println("login "+login+" password "+mdp);
	  return userService.signin(login, mdp);
	}

	
//	@PostMapping("/signup")
//	  @ApiOperation(value = "${UserRestService.signup}")
//	  @ApiResponses(value = {//
//	      @ApiResponse(code = 400, message = "Something went wrong"), //
//	      @ApiResponse(code = 403, message = "Access denied"), //
//	      @ApiResponse(code = 422, message = "Username is already in use"), //
//	      @ApiResponse(code = 500, message = "Expired or invalid JWT token")})
//	  public String signup(@ApiParam("Signup User") @RequestBody UserDataDTO user) {
//	    return userService.signup(modelMapper.map(user, User.class));
//	  }
}
