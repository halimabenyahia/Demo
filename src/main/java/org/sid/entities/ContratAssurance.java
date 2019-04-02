package org.sid.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ContratAssurance {
	
	
	@Id @GeneratedValue
	private int id_contrat ;
	private Long montant_contrat ;
	@Temporal(TemporalType.DATE)
	private Date date_deb_contrat ;
	@Temporal(TemporalType.DATE)
	private Date date_fin_contrat ;
	private String num_police ;
	
	@OneToOne
	@JoinColumn(name="id_assurance")
	private Assurance assurance_c ;
	
	
	public int getId_contrat() {
		return id_contrat;
	}
	public void setId_contrat(int id_contrat) {
		this.id_contrat = id_contrat;
	}
	public Long getMontant_contrat() {
		return montant_contrat;
	}
	public void setMontant_contrat(Long montant_contrat) {
		this.montant_contrat = montant_contrat;
	}
	public Date getDate_deb_contrat() {
		return date_deb_contrat;
	}
	public void setDate_deb_contrat(Date date_deb_contrat) {
		this.date_deb_contrat = date_deb_contrat;
	}
	public Date getDate_fin_contrat() {
		return date_fin_contrat;
	}
	public void setDate_fin_contrat(Date date_fin_contrat) {
		this.date_fin_contrat = date_fin_contrat;
	}
	public String getNum_police() {
		return num_police;
	}
	public void setNum_police(String num_police) {
		this.num_police = num_police;
	}
	public ContratAssurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ContratAssurance(int id_contrat, Long montant_contrat, Date date_deb_contrat, Date date_fin_contrat,
			String num_police) {
		super();
		this.id_contrat = id_contrat;
		this.montant_contrat = montant_contrat;
		this.date_deb_contrat = date_deb_contrat;
		this.date_fin_contrat = date_fin_contrat;
		this.num_police = num_police;
	}
	
	
	

}
