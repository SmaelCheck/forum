package objects;

import java.util.Date;
import java.util.List;

public class Forum
		implements
			IAbonneForum,
			IModerateurForum,
			IForumAbonne,
			IForumModerateur {
	private String nom;
	private Date dateCreation;
	private List<Nouvelle> listeNouvelle;
	private List<Abonne> listeAbonne;


	public Forum(String nom) {
		this.nom = nom;
		this.dateCreation = new Date();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Nouvelle> getListeNouvelle() {
		return listeNouvelle;
	}

	public void setListeNouvelle(List<Nouvelle> listeNouvelle) {
		this.listeNouvelle = listeNouvelle;
	}

	public List<Abonne> getListeAbonne() {
		return listeAbonne;
	}

	public void setListeAbonne(List<Abonne> listeAbonne) {
		this.listeAbonne = listeAbonne;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	@Override
	public boolean supprimerNouvelle(Nouvelle n) {

		for (Nouvelle nouvelle : listeNouvelle) {
			if (nouvelle.equals(n)) {
				listeNouvelle.remove(nouvelle);
				return true;
			}
		}
		return false;
	}

	@Override
	public void bannirUnAbonne(Abonne a) {

	}

	@Override
	public int ajouterAbonne(Abonne a) {
		boolean isTrue = false;

		if (this.isExiste(a)) {
			return 1;
		} 
		this.listeAbonne.add(a);

		return 0;
	}

	@Override
	public void listerAbonnes() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean ajouterNouvelle(Nouvelle n) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void consulterNouvelle(int i) {
		// TODO Auto-generated method stub

	}

	@Override
	public void repondreNouvelle(int i) {
		// TODO Auto-generated method stub

	}
	
	//////////
	private boolean isExiste(Abonne a) {
		for (Abonne abo : listeAbonne) {
			if (abo.equals(a)) {
				return true;
			} 
		}
		return false;
	}

}
