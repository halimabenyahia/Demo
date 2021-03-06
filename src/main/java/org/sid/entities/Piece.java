package org.sid.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Piece {
	
	@Id@GeneratedValue
	private int id_piece ;
	private String reference_piece ;
	private String des_piece ;
	private Long tva_p ;
	private Long prix_achat ;
	private Long qte_p ;
	private Long remise_p ;
	
	@OneToOne
	@JoinColumn(name="id_typePiece")
	private TypePiece type_piece_p ;
	
	@ManyToOne
	@JoinColumn(name="id_entree")
	private EntreeStock entre_stock ;
	
	@ManyToOne
	@JoinColumn(name="id_sortieStock")
	private SortieStock sortie_stock ;

	public int getId_piece() {
		return id_piece;
	}

	public void setId_piece(int id_piece) {
		this.id_piece = id_piece;
	}

	public String getReference_piece() {
		return reference_piece;
	}

	public void setReference_piece(String reference_piece) {
		this.reference_piece = reference_piece;
	}

	public String getDes_piece() {
		return des_piece;
	}

	public void setDes_piece(String des_piece) {
		this.des_piece = des_piece;
	}

	public Long getTva_p() {
		return tva_p;
	}

	public void setTva_p(Long tva_p) {
		this.tva_p = tva_p;
	}

	public Long getPrix_achat() {
		return prix_achat;
	}

	public void setPrix_achat(Long prix_achat) {
		this.prix_achat = prix_achat;
	}

	public Long getQte_p() {
		return qte_p;
	}

	public void setQte_p(Long qte_p) {
		this.qte_p = qte_p;
	}

	public Long getRemise_p() {
		return remise_p;
	}

	public void setRemise_p(Long remise_p) {
		this.remise_p = remise_p;
	}

	public TypePiece getType_piece_p() {
		return type_piece_p;
	}

	public void setType_piece_p(TypePiece type_piece_p) {
		this.type_piece_p = type_piece_p;
	}

	public EntreeStock getEntre_stock() {
		return entre_stock;
	}

	public void setEntre_stock(EntreeStock entre_stock) {
		this.entre_stock = entre_stock;
	}

	public SortieStock getSortie_stock() {
		return sortie_stock;
	}

	public void setSortie_stock(SortieStock sortie_stock) {
		this.sortie_stock = sortie_stock;
	}

	public Piece(int id_piece, String reference_piece, String des_piece, Long tva_p, Long prix_achat, Long qte_p,
			Long remise_p, TypePiece type_piece_p, EntreeStock entre_stock, SortieStock sortie_stock) {
		super();
		this.id_piece = id_piece;
		this.reference_piece = reference_piece;
		this.des_piece = des_piece;
		this.tva_p = tva_p;
		this.prix_achat = prix_achat;
		this.qte_p = qte_p;
		this.remise_p = remise_p;
		this.type_piece_p = type_piece_p;
		this.entre_stock = entre_stock;
		this.sortie_stock = sortie_stock;
	}

	public Piece() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	

}
