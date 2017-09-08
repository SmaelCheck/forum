package objects;

public interface IForumModerateur {

	boolean supprimerNouvelle(Nouvelle n);
	void bannirUnAbonne(Abonne a);
	int ajouterAbonne(Abonne a);
	void listerAbonnes();
}
