package com.yesserp.domain.gtaparam;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: CycleTravailAssociateJourneeType
 * 
 */
@Entity
public class CycleTravailAssociateJourneeType implements Serializable {

	private static final long serialVersionUID = 1L;

	private CycleAssociateJourneeTypeEmbeddebale associateJourneeTypeEmbeddebale;
	private CycleTravail cycleTravail;
	private JourneeType journeeType;


	public CycleTravailAssociateJourneeType() {
		super();
	}

	@EmbeddedId
	public CycleAssociateJourneeTypeEmbeddebale getAssociateJourneeTypeEmbeddebale() {
		return associateJourneeTypeEmbeddebale;
	}

	public void setAssociateJourneeTypeEmbeddebale(
			CycleAssociateJourneeTypeEmbeddebale associateJourneeTypeEmbeddebale) {
		this.associateJourneeTypeEmbeddebale = associateJourneeTypeEmbeddebale;
	}

	@ManyToOne
	@JoinColumn(name = "idCycleTravail", referencedColumnName = "idct", insertable = false, updatable = false)
	public CycleTravail getCycleTravail() {
		return cycleTravail;
	}

	public void setCycleTravail(CycleTravail cycleTravail) {
		this.cycleTravail = cycleTravail;
	}

	@ManyToOne
	@JoinColumn(name = "idJourneeType", referencedColumnName = "idjt", insertable = false, updatable = false)
	public JourneeType getJourneeType() {
		return journeeType;
	}

	public void setJourneeType(JourneeType journeeType) {
		this.journeeType = journeeType;
	}

}
