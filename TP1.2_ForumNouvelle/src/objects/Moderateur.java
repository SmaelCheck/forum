package objects;

public class Moderateur extends Utilisateur {

	public Moderateur(String prenom, String nom, int age) {
		super(prenom,nom,age);
	}
	public int ajouterAbonne(Abonne a) {
		return 1;
	}
	public void supprimerNouvelle(Nouvelle n) {
		
	}
	public void afficherLesAbonnes() {
		
	}
}
