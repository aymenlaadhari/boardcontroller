package com.yesserp.sessionbean.pg.gestionFiliale;

import java.util.List;
import javax.ejb.Local;
import com.yesserp.domain.pg.Filiale;



@Local
public interface GestionFilialeLocal {
	
	
	public void ajouterFiliale(Filiale i);
	public void supprimerFiliale(Filiale i);
	public void modifierFiliale(Filiale i);
	public List<Filiale> AfficherTousFiliale();
	
/*
	
	public List<Filiale> trouverParNumFiliale(String numFiliale);
	public List<Filiale> trouverParNom(String nom);
	*/
	

	

}
