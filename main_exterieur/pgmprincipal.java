package main_exterieur;
import java.util.Scanner;
import td_cnam.PersonnageJoueur;
import td_cnam.Personnage;
import td_cnam.PersonnageJoueurGuerrier;
public class pgmprincipal {
	private static Scanner scanner = new Scanner(System.in).useDelimiter("\\n");
	
	public pgmprincipal() {
		// rien
	}

	public static void main(String[] args) {
		
		/*System.out.println("creez un personnage");
		td_cnam.PersonnageJoueur perso = new td_cnam.PersonnageJoueur();
		System.out.println("saissez nom");
		String nom = saisie_chaine();
		perso.setNom(nom);
		System.out.println("saisissez race");
		String race = saisie_chaine();
		perso.setRace(race);
		System.out.println("saisissez poids");
		int poids = saisie_entier();
		perso.setPoids(poids);
		System.out.println("taille");
		int taille = saisie_entier();
		perso.setTaille(taille);
		System.out.println(perso.description());*/
		
		PersonnageJoueurGuerrier pg = new PersonnageJoueurGuerrier("aa", 14, 175, "rrr", 34, 0);
		System.out.println("pg est il fatigue?" + pg.isFatigue());
		PersonnageJoueurGuerrier pg2 = new PersonnageJoueurGuerrier();
		pg2.setForce(9000);
		System.out.println("pg est il moins fort que pg2? " + pg.estMoinsFortQue(pg2));
	}
	
	public static String saisie_chaine(){
		// tester si l instance existe
		// TODO http://stackoverflow.com/questions/17459050/java-util-nosuchelementexception-no-line-found-at-java-util-scanner-nextlinesc?rq=1
		// (non fermeture de flux)
		// TODO https://www.securecoding.cert.org/confluence/display/java/FIO06-J.+Do+not+create+multiple+buffered+wrappers+on+a+single+byte+or+character+stream 
		// interdiction d en ouvrir 2
		String a = "vide";
		//Scanner scanner = new Scanner(System.in);
		
		try {
			if (scanner.hasNextLine()){
				afficher_texte("nv ligne trouvée. a vaut avant affectation: " + a);
				a = scanner.nextLine();
				afficher_texte("nv ligne trouvée. a vaut apres affectation: " + a);}
		}
		catch (java.util.NoSuchElementException e) {
			afficher_texte("pas_trouve_chaine_a_lire_sur_entree_courante" + ' ' + e);
		}
		finally{
			/*if(scanner!=null)
			{ scanner.close();} // TODO if you close it you have to renew it bug BUG JAVA you are not allowed to. so let it leak.
			*/
			
			}
		System.out.println("a vaut: " + a);
		return a;
	}
	
	
	public static void afficher_texte(String s){
		System.out.println(s);
	}
	
	public static int saisie_entier(){
		//Scanner s = new Scanner(System.in);
		int i = Integer.parseInt(scanner.nextLine());
		//s.close();
		return i;
		
	}

}
