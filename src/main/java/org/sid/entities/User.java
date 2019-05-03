package org.sid.entities;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class User {
	
	@Id @GeneratedValue
	private int id_user ;
	private String login ;
	private String mdp ;
	private boolean etat_admin ;
	
	@ElementCollection(fetch = FetchType.EAGER)
	  List<Role> roles;

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public boolean isEtat_admin() {
		return etat_admin;
	}

	public void setEtat_admin(boolean etat_admin) {
		this.etat_admin = etat_admin;
	}

	 public List<Role> getRoles() {
		    return roles;
		  }

		  public void setRoles(List<Role> roles) {
		    this.roles = roles;
		  }

	
	public User(int id_user, String login, String mdp, boolean etat_admin, List<Role> roles) {
			super();
			this.id_user = id_user;
			this.login = login;
			this.mdp = mdp;
			this.etat_admin = etat_admin;
			this.roles = roles;
		}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
