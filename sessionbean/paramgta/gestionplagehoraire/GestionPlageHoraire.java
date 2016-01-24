package com.yesserp.sessionbean.paramgta.gestionplagehoraire;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.yesserp.domain.gtaparam.JourneeType;
import com.yesserp.domain.gtaparam.PlageHoraire;

/**
 * Session Bean implementation class GestionPlageHoraire
 */
@Stateless
@LocalBean
public class GestionPlageHoraire implements GestionPlageHoraireLocal {

	/**
	 * Default constructor.
	 */
	public GestionPlageHoraire() {
		// TODO Auto-generated constructor stub
	}

	@PersistenceContext(unitName = "yessclever")
	EntityManager entityManager;

	@Override
	public void ajouterPlageHoraire(PlageHoraire plageHoraire) {
		entityManager.persist(plageHoraire);

	}

	@TransactionAttribute
	@Override
	public void supprimerPlageHoraire(PlageHoraire plageHoraire) {

		entityManager.remove(entityManager.merge(plageHoraire));

	}

	@Override
	public void modifierPlageHoraire(PlageHoraire plageHoraire) {
		entityManager.merge(plageHoraire);

	}

	@Override
	public List<PlageHoraire> listerPlageHoraire() {
		Query query = entityManager
				.createQuery("SELECT pl FROM PlageHoraire pl");
		return query.getResultList();
	}

	@Override
	public PlageHoraire findPlageHoraireById(int idPlageHoraire) {
		return entityManager.find(PlageHoraire.class, idPlageHoraire);
	}

	@Override
	public PlageHoraire findPlageHoraireByCode(String code) {
		Query query = entityManager
				.createQuery("SELECT pl FROM PlageHoraire pl WHERE codeph=:x");
		query.setParameter("x", code);
		return (PlageHoraire) query.getSingleResult();
	}

	@Override
	public List<PlageHoraire> findAllPlagesHoraireForJourneeType(
			JourneeType journeeType) {
		Query query = entityManager
				.createQuery("select p from PlageHoraire p join p.plageHoraireAssociateJourneeTypes r  where r.journeeType=:journeeType");
		query.setParameter("journeeType", journeeType);
		return query.getResultList();
	}

	@Override
	public List<PlageHoraire> findAllPlagesHoraire() {
		Query query = entityManager
				.createQuery("select p from PlageHoraire p order by idph desc");

		return query.getResultList();
	}

	@Override
	public int trouverHeureDeb(PlageHoraire plageHoraire,
			JourneeType journeeType) {
		Query query = entityManager
				.createQuery("select p.hAssociateJourneeTPK.heureDeb from PlageHoraireAssociateJourneeType p where p.plageHoraire=:pl and p.journeeType=:jo");
		query.setParameter("pl", plageHoraire);
		query.setParameter("jo", journeeType);
		return (int) query.getSingleResult();
	}

	@Override
	public int trouverHeureFin(PlageHoraire plageHoraire,
			JourneeType journeeType) {
		Query query = entityManager
				.createQuery("select p.heureFin from PlageHoraireAssociateJourneeType p where p.plageHoraire=:pl and p.journeeType=:jo");
		query.setParameter("pl", plageHoraire);
		query.setParameter("jo", journeeType);
		return (int) query.getSingleResult();
	}

}
