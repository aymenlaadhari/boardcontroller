package com.yesserp.domain.crm;

import java.io.Serializable;
import java.lang.Long;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: DocumentCompte
 *
 */
@Entity
@Table(name="crm_doccrh01")
public class DocumentCompte implements Serializable {

	
	private Long id;
	private String nom;
	private String type;
	private byte[] doc;
	private String notearch;
	private String description;
	private Date dateeupload;
	private Date dateentite;

	private Compte compte;
	private DossierDocument dossierDocument;
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public byte[] getDoc() {
		return doc;
	}
	public void setDoc(byte[] doc) {
		this.doc = doc;
	}
	public String getNotearch() {
		return notearch;
	}
	public void setNotearch(String notearch) {
		this.notearch = notearch;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	public Date getDateeupload() {
		return dateeupload;
	}
	public void setDateeupload(Date dateeupload) {
		this.dateeupload = dateeupload;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	public Date getDateentite() {
		return dateentite;
	}
	public void setDateentite(Date dateentite) {
		this.dateentite = dateentite;
	}

	
	private static final long serialVersionUID = 1L;

	public DocumentCompte() {
		super();
	}   
	@Id    
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	@ManyToOne
	public Compte getCompte() {
		return compte;
	}
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	
	@ManyToOne
	public DossierDocument getDossierDocument() {
		return dossierDocument;
	}
	public void setDossierDocument(DossierDocument dossierDocument) {
		this.dossierDocument = dossierDocument;
	}
   
}
