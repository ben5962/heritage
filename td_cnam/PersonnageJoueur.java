package td_cnam;

public class PersonnageJoueur extends Personnage {
	protected String nom;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public PersonnageJoueur() {
		super();
		this.setNom("anonyme");
	}

	
	public PersonnageJoueur(String Race, int poids, int taille, String nom) {
		super(Race, poids, taille);
		this.setNom(nom);
			
	}
	
	@Override
	public String description(){
       return super.description() + "et s appelle" + this.getNom();
    
	}
	
	@Override
	public String marcher(){
       return "le personnage joueur marche";
	}
	

}
