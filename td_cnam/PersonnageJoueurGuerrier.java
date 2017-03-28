package td_cnam;

public class PersonnageJoueurGuerrier extends PersonnageJoueur {
private int force;
public int getForce() {
	return force;
}

public void setForce(int force) {
	this.force = force;
}

private int niveauEnergie;
public int getNiveauEnergie() {
	return niveauEnergie;
}

public void setNiveauEnergie(int niveauEnergie) {
	this.niveauEnergie = niveauEnergie;
}

public boolean isFatigue() {
	
	return fatigue;
}

public void setFatigue() {
	this.fatigue = new Integer(this.getNiveauEnergie()).equals(0);
}

private boolean fatigue;
	
	
	public PersonnageJoueurGuerrier(){
		super("unerace", 13,34, "anonyme");
		this.setNiveauEnergie(0);
		this.setFatigue();
	}

	public PersonnageJoueurGuerrier(String Race, int poids, int taille, String nom, int force, int niveauenergie) {
		super(Race, poids, taille, nom);
		this.setForce(force);
		this.setNiveauEnergie(niveauenergie);
		this.setFatigue();
		
	}
	
	public String description(){
		return super.description() + "et dont la force est de " + this.getForce();
	}
	
	public boolean estMoinsFortQue(PersonnageJoueurGuerrier adversaire){
		return this.getForce() < adversaire.getForce();
	}

}
