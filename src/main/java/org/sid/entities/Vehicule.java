package org.sid.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Vehicule {
	

	@Id
	private String id_immatriculation ;
	@Temporal(TemporalType.DATE)
	private Date date_m_c ;
	@Temporal(TemporalType.DATE)
	private Date date_acq ;
	private Long cout_achat ;
	private Long compteur ;
	private String num_moteur ;
	private String num_fab ;
	@Temporal(TemporalType.DATE)
	private Date date_deb_taxe ;
	@Temporal(TemporalType.DATE)
	private Date date_fin_taxe ;
	private Long montant_taxe ;
	@Temporal(TemporalType.DATE)
	private Date date_deb_vig ;
	@Temporal(TemporalType.DATE)
	private Date date_fin_vig ;
	private Long montant_vig ;
	@Temporal(TemporalType.DATE)
	private Date date_deb_visit_tech ;
	@Temporal(TemporalType.DATE)
	private Date date_fin_visit_tech ;
	private Long montant_visit_tech ;
	
	
	@ManyToOne
	@JoinColumn(name="id_typeVehicule")
	private TypeVehicule type_vehicule ;
	
	@OneToOne
	@JoinColumn(name="id_typeBoite")
private TypeBoite type_boite ;
	
	@OneToOne
	@JoinColumn(name="id_energie")
	private Energie energie_v ;
	
//	@OneToOne
	//@JoinColumn(name="id_affectation")
//	private AffectationVehicule affectation_vehicule ;
//	
//	@OneToOne
//	@JoinColumn (name="id_contrat")
//	private ContratAssurance contrat_assurance ;
//	
//	@OneToOne
//	@JoinColumn(name="id_marque")
//	private Marque marque_v ;
//	
//	@OneToOne
//	@JoinColumn(name="id_modele")
//	private Modele modele_v ;
//	
//	@ManyToOne
//	@JoinColumn(name="id_chauffeur")
//	private Chauffeurs chauffeur_v ;
//	
	@ManyToOne
	@JoinColumn(name="id_depense")
	private Depense depense_v ;
	
//	@ManyToOne
//	@JoinColumn(name="id_programme")
//	private ProgrammeEntretien prog_v ;

	public String getId_immatriculation() {
		return id_immatriculation;
	}

	public void setId_immatriculation(String id_immatriculation) {
		this.id_immatriculation = id_immatriculation;
	}

	public Date getDate_m_c() {
		return date_m_c;
	}

	public void setDate_m_c(Date date_m_c) {
		this.date_m_c = date_m_c;
	}

	public Date getDate_acq() {
		return date_acq;
	}

	public void setDate_acq(Date date_acq) {
		this.date_acq = date_acq;
	}

	public Long getCout_achat() {
		return cout_achat;
	}

	public void setCout_achat(Long cout_achat) {
		this.cout_achat = cout_achat;
	}

	public Long getCompteur() {
		return compteur;
	}

	public void setCompteur(Long compteur) {
		this.compteur = compteur;
	}

	public String getNum_moteur() {
		return num_moteur;
	}

	public void setNum_moteur(String num_moteur) {
		this.num_moteur = num_moteur;
	}

	public String getNum_fab() {
		return num_fab;
	}

	public void setNum_fab(String num_fab) {
		this.num_fab = num_fab;
	}

	public Date getDate_deb_taxe() {
		return date_deb_taxe;
	}

	public void setDate_deb_taxe(Date date_deb_taxe) {
		this.date_deb_taxe = date_deb_taxe;
	}

	public Date getDate_fin_taxe() {
		return date_fin_taxe;
	}

	public void setDate_fin_taxe(Date date_fin_taxe) {
		this.date_fin_taxe = date_fin_taxe;
	}

	public Long getMontant_taxe() {
		return montant_taxe;
	}

	public void setMontant_taxe(Long montant_taxe) {
		this.montant_taxe = montant_taxe;
	}

	public Date getDate_deb_vig() {
		return date_deb_vig;
	}

	public void setDate_deb_vig(Date date_deb_vig) {
		this.date_deb_vig = date_deb_vig;
	}

	public Date getDate_fin_vig() {
		return date_fin_vig;
	}

	public void setDate_fin_vig(Date date_fin_vig) {
		this.date_fin_vig = date_fin_vig;
	}

	public Long getMontant_vig() {
		return montant_vig;
	}

	public void setMontant_vig(Long montant_vig) {
		this.montant_vig = montant_vig;
	}

	public Date getDate_deb_visit_tech() {
		return date_deb_visit_tech;
	}

	public void setDate_deb_visit_tech(Date date_deb_visit_tech) {
		this.date_deb_visit_tech = date_deb_visit_tech;
	}

	public Date getDate_fin_visit_tech() {
		return date_fin_visit_tech;
	}

	public void setDate_fin_visit_tech(Date date_fin_visit_tech) {
		this.date_fin_visit_tech = date_fin_visit_tech;
	}

	public Long getMontant_visit_tech() {
		return montant_visit_tech;
	}

	public void setMontant_visit_tech(Long montant_visit_tech) {
		this.montant_visit_tech = montant_visit_tech;
	}

	public TypeVehicule getType_vehicule() {
		return type_vehicule;
	}

	public void setType_vehicule(TypeVehicule type_vehicule) {
		this.type_vehicule = type_vehicule;
	}

	public TypeBoite getType_boite() {
		return type_boite;	}

	public void setType_boite(TypeBoite type_boite) {
		this.type_boite = type_boite;
	}

	public Energie getEnergie_v() {
		return energie_v;
	}

	public void setEnergie_v(Energie energie_v) {
		this.energie_v = energie_v;
	}

//	public AffectationVehicule getAffectation_vehicule() {
//		return affectation_vehicule;
//	}
//
//	public void setAffectation_vehicule(AffectationVehicule affectation_vehicule) {
//		this.affectation_vehicule = affectation_vehicule;
//	}
//
//	public ContratAssurance getContrat_assurance() {
//		return contrat_assurance;
//	}
//
//	public void setContrat_assurance(ContratAssurance contrat_assurance) {
//		this.contrat_assurance = contrat_assurance;
//	}
////
//	public Marque getMarque_v() {
//		return marque_v;
//	}
//
//	public void setMarque_v(Marque marque_v) {
//		this.marque_v = marque_v;
//	}
//
//	public Modele getModele_v() {
//		return modele_v;
//	}
//
//	public void setModele_v(Modele modele_v) {
//		this.modele_v = modele_v;
//	}
//
//	public Chauffeurs getChauffeur_v() {
//		return chauffeur_v;
//	}
//
//	public void setChauffeur_v(Chauffeurs chauffeur_v) {
//		this.chauffeur_v = chauffeur_v;
//	}
//
	public Depense getDepense_v() {
		return depense_v;
	}

	public void setDepense_v(Depense depense_v) {
		this.depense_v = depense_v;
	}
//
//	public ProgrammeEntretien getProg_v() {
//		return prog_v;
//	}
//
//	public void setProg_v(ProgrammeEntretien prog_v) {
//		this.prog_v = prog_v;
//	}

	public Vehicule(String id_immatriculation, Date date_m_c, Date date_acq, Long cout_achat, Long compteur,
			String num_moteur, String num_fab, Date date_deb_taxe, Date date_fin_taxe, Long montant_taxe,
			Date date_deb_vig, Date date_fin_vig, Long montant_vig, Date date_deb_visit_tech, Date date_fin_visit_tech,
			Long montant_visit_tech, TypeVehicule type_vehicule, TypeBoite type_boite, Energie energie_v,
			AffectationVehicule affectation_vehicule, ContratAssurance contrat_assurance, Marque marque_v,
			Modele modele_v, Chauffeurs chauffeur_v, Depense depense_v, ProgrammeEntretien prog_v) {
		super();
		this.id_immatriculation = id_immatriculation;
		this.date_m_c = date_m_c;
		this.date_acq = date_acq;
		this.cout_achat = cout_achat;
		this.compteur = compteur;
		this.num_moteur = num_moteur;
		this.num_fab = num_fab;
		this.date_deb_taxe = date_deb_taxe;
		this.date_fin_taxe = date_fin_taxe;
		this.montant_taxe = montant_taxe;
		this.date_deb_vig = date_deb_vig;
		this.date_fin_vig = date_fin_vig;
		this.montant_vig = montant_vig;
		this.date_deb_visit_tech = date_deb_visit_tech;
		this.date_fin_visit_tech = date_fin_visit_tech;
		this.montant_visit_tech = montant_visit_tech;
     	this.type_vehicule = type_vehicule;
	this.type_boite = type_boite;
	this.energie_v = energie_v;
//		this.affectation_vehicule = affectation_vehicule;
//		this.contrat_assurance = contrat_assurance;
//		this.marque_v = marque_v;
//		this.modele_v = modele_v;
//		this.chauffeur_v = chauffeur_v;
	this.depense_v = depense_v;
//		this.prog_v = prog_v;
	}

	public Vehicule() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
