package com.yesserp.domain.pg;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.yesserp.domain.gtaparam.Libelle;




@Entity
@Table(name="pg_Filiale")
public class Filiale implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	public Filiale() {	
	}
	
	private	int code;
	private List<Libelle> libelles;
	private Societe societe ;
	private String description ;
	private String localistation ;
	private List<Module> module;
	
	@Id
	public int getCode() {
		return this.code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	
	
	@OneToMany(mappedBy = "filiale",cascade=CascadeType.REMOVE,fetch = FetchType.EAGER)
	public List<Libelle> getLibelles() {
		return libelles;
	}
	public void setLibelles(List<Libelle> libelles) {
		this.libelles = libelles;
	}

	@ManyToOne
	public Societe getSociete() {
		return societe;
	}
	public void setSociete(Societe societe) {
		this.societe = societe;
	}
	
	
	@OneToMany(mappedBy = "filiale")
	public List<Module> getModule() {
		return module;
	}
	public void setModule(List<Module> module) {
		this.module = module;
	}
	
	
	public String getDescription() {
		return description;
	}
	public String getLocalistation() {
		return localistation;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	public void setLocalistation(String localistation) {
		this.localistation = localistation;
	}
	
}