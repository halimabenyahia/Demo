package org.sid.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Marque {

	@Id @GeneratedValue
	private int id_marque ;
	private String des_marque ;
	
	@ManyToOne
	@JoinColumn(name="id_modele")
	private Modele modele_m ;

	public int getId_marque() {
		return id_marque;
	}

	public void setId_marque(int id_marque) {
		this.id_marque = id_marque;
	}

	public String getDes_marque() {
		return des_marque;
	}

	public void setDes_marque(String des_marque) {
		this.des_marque = des_marque;
	}

	public Modele getModele_m() {
		return modele_m;
	}

	public void setModele_m(Modele modele_m) {
		this.modele_m = modele_m;
	}

	public Marque(int id_marque, String des_marque, Modele modele_m) {
		super();
		this.id_marque = id_marque;
		this.des_marque = des_marque;
		this.modele_m = modele_m;
	}

	public Marque() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
