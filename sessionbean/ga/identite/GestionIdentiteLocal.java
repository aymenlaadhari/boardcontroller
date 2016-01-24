package com.yesserp.sessionbean.ga.identite;

import java.util.Date;
import java.util.List;

import javax.ejb.Local;

import com.yesserp.domain.ga.Adresse;
import com.yesserp.domain.ga.Certification;
import com.yesserp.domain.ga.CoordonneeBancaire;
import com.yesserp.domain.ga.Cycle;
import com.yesserp.domain.ga.DiplomeGa;
import com.yesserp.domain.ga.Embauche;
import com.yesserp.domain.ga.Experience;
import com.yesserp.domain.ga.Identite;
import com.yesserp.domain.ga.InfosIndividuelles;
import com.yesserp.domain.ga.InfosPhysiques;
import com.yesserp.domain.ga.Mail;
import com.yesserp.domain.ga.Naissance;
import com.yesserp.domain.ga.Nationalite;
import com.yesserp.domain.ga.PersonneACharge;
import com.yesserp.domain.ga.PieceIdentite;
import com.yesserp.domain.ga.Profil;
import com.yesserp.domain.ga.SituationCivile;
import com.yesserp.domain.ga.SituationMedicale;
import com.yesserp.domain.ga.Statut;
import com.yesserp.domain.ga.Telephone;
import com.yesserp.domain.ga.Vehicule;
import com.yesserp.domain.gta.ClasseEmp;
import com.yesserp.domain.gta.ContratGta;
import com.yesserp.domain.gtaparam.GroupeActivite;
import com.yesserp.domain.gtaparam.GroupeCompteur;
import com.yesserp.domain.gtaparam.GroupeImputation;

@Local
public interface GestionIdentiteLocal {

	public boolean ajouterIdentite(Identite i);

	public void supprimerIdentite(Identite i);

	public void modifierIdentite(Identite i);

	public Identite trouverParNumeroDossier(Long numdoss);

	public Identite trouverParMatricule(String matricule);

	public List<Identite> trouverParNom(String nom);
	
	public void ajouterPieceIdentite(Identite identite, PieceIdentite nouveauPieceIdentite);

	public void ajouterNaissance(Identite identite, Naissance naissance);

	public void ajouterFicheIndividuelle(Identite identite,
			InfosIndividuelles infosIndividuelles);

	public void ajouterFichePhysique(Identite identite,
			InfosPhysiques infosPhysiques);

	public void ajouterCycle(Identite identite, Cycle cycle);

	public void ajouterProfil(Identite identite, Profil profil);

	public void ajouterAdresse(Identite identite, Adresse adresse);

	public void ajouterListeAdresses(Identite identite, List<Adresse> adresses);

	public void ajouterStatut(Identite identite, Statut statut);

	public void ajouterSituationCivile(Identite identite,
			SituationCivile situationCivile);

	public void ajouterPersonneACharge(Identite identite,
			PersonneACharge aCharge);

	public void ajouterListePersonneACharge(Identite identite,
			List<PersonneACharge> aCharges);

	public void ajouterEmbauche(Identite identite, Embauche embauche);

	public void ajouterTelephone(Identite identite, Telephone telephone);

	public void ajouterListeTelephones(Identite identite,
			List<Telephone> telephones);

	public void ajouterMail(Identite identite, Mail mail);

	public void ajouterListeMails(Identite identite, List<Mail> mails);

	public void ajouterCoordonneeBancaire(Identite identite,
			CoordonneeBancaire coordonneeBancaire);

	public void ajouterNationalite(Identite identite, Nationalite nationalite);

	public void ajouterSituationMedicale(Identite identite,
			SituationMedicale situationMedicale);

	public void ajouterVehicule(Identite identite, Vehicule vehicule);

	public void ajouterDiplome(Identite identite, DiplomeGa diplome);

	public void ajouterCertification(Identite identite,
			Certification certification);

	public void ajouterExperience(Identite identite, Experience experience);

	public void ajouterListDiplomes(Identite identite, List<DiplomeGa> diplomes);

	public void ajouterListExperiences(Identite identite,
			List<Experience> experiences);

	public void ajouterListCertifications(Identite identite,
			List<Certification> certifications);

	public void ajouterListCoordonneeBancaires(Identite identite,
			List<CoordonneeBancaire> coordonneeBancaires);

	public void ajouterListNationalites(Identite identite,
			List<Nationalite> nationalites);

	public void ajouterListPiecesIdentite(Identite identite,
			List<PieceIdentite> piecesidentite);

	
	public void ajouterListSituationMedicales(Identite identite,
			List<SituationMedicale> situationMedicales);

	public void ajouterListVehicules(Identite identite, List<Vehicule> vehicules);

	public List<Identite> findAll();

	public int trouverNextMatriculeParPrefixe(String prefixe, int taillePrefixe);

	public List<Identite> trouverParLikeMatricule(String matricul, int n);
	
	public List<Identite> trouverParLikeMatriculeNomPrenomSexe(String matricul,
			String nom, String prenom, String sexe, int n);

	public List<Identite> trouverParLikeMatriculePosteUo(
			String matricul, String poste, String uo, int n);
	
	
	public List<Identite> trouverParLikeMatriculeNomPrenomSexePosteUo(
			String matricul, String nom, String prenom, String sexe, String poste, String uo, int n);
	
	
	//ajoute par SMI
	public void ajouterGroupeimputation(Identite identite, GroupeImputation groupeImputation);
	
	
	public void ajouterGroupeactivite(Identite identite, GroupeActivite groupeActivite);
	public List<Identite> trouverByCriteria(
			String matricul, String nom, String prenom, String sexe, String poste, String uo,String emploi,String  valeurPieceIdentite,String  typePieceIdentite,String situaFam,String typeContrat,String nationalitePays, String niveauDiplome,String certificat ,Date DateEmbauche,String experiencePoste,String experienceSociete);
	
	public void ajouterGroupeCompteur(Identite identite, GroupeCompteur groupeCompteur);
	public void ajouterSoumissionGta(Identite identite, ContratGta contratGta );
	public void ajouterClasseEmp(Identite identite, ClasseEmp classeEmp );
	
}
