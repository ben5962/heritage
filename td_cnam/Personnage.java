package td_cnam;

public class Personnage {
private String race;
private int taille;
private int poids;


	public String getRace() {
	return race;
}


public void setRace(String race) {
	this.race = race;
}


public int getTaille() {
	return taille;
}


public void setTaille(int taille) {
	this.taille = taille;
}


public int getPoids() {
	return poids;
}


public void setPoids(int poids) {
	this.poids = poids;
}



	public Personnage() {
		this.setRace("race par défaut");
		this.setPoids(65);
		this.setTaille(180);
	}
	
	public Personnage(String Race, int poids, int taille){
		this.setRace(Race);
		this.setPoids(poids);
		this.setTaille(taille);
	}
	
	public String marcher() {
		return "le personnage marche";
	}

	public String dormir(){
		return "le personnage dort";
	}
	
	public String description(){
		return "personnage de race" + this.getRace() + " de poids " + this.getPoids() + " de taille " + this.getTaille();
	}
}
