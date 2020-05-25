package scenario;

import java.util.Scanner;

import dungeon.Dungeon;
import personnage.Joueur;

public abstract class Scenario {

	public static void lireScenario() {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("/n ********      WORLD OF CDA **********");
		System.out.println("Une l�gende raconte, qu'en l'an 1365 de l'�re JAHAVA, un �tre sera capable de trouver la r�ponse � l'algirythme ultime. ");
		System.out.println("Le moment est enfin arriv� pour le pays d'Afpa de retrouver et sauver cette personne.");
		System.out.println("");
		System.out.println("...");
		System.out.println();
		System.out.println(".........");
		System.out.println("EMASI: Bonjour tout le monde. J'esp�re que vous allez tous bien.");
		System.out.println("EMASI: Tr�s bien! Je vois que tout le monde est en forme. Par contre jze ne t'ai pas encore entendu...");
		
		System.out.println();
		System.out.println("Saisissez votre nom");
		String vNomjoueur =sc.nextLine();
		
		System.out.println("EMASI: Oui! C'est �a. "+vNomjoueur+"! J'avais oubli�. J'ai justeent un petit coup de main � te demander.");
		System.out.println("EMASI: Certains ont choisi le chemin des armes et d'autres celui des arcanes.");
		System.out.println("EMASI: Quel chemin choisis tu de suivre?");
		System.out.println("***********");
		System.out.println();
		
		String vCLasseJoueur = sc.nextLine();
		
		Joueur.creerJoueur(vNomjoueur, vCLasseJoueur);
		
		
		System.out.println("EMASI: Tr�s bien! Il semble que quelqu'un ait vol� le grimoire de Madame C�h�e Cesse.");
		System.out.println("EMASI: Les traces m�nent au manoire de la jet�e aimelle.");
		System.out.println("EMASI: S'il te plait, va voir si tu y trouves quelques chose.");
		System.out.println();
		System.out.println();
		
		System.out.println("******* Chapitre un : Une �trange d�couverte. *******");
		
		System.out.println("******* Apr�s avoir quitt� la ville d'Ewi, vous vous engagez dans la for�t de Thif�.");
		System.out.println("Rapidement, la v�g�tation se fait plus dense, plus sombre.");
		System.out.println();
		System.out.println("Un denier rayon de soleil perce � travers le feuillage des ch�nes quand...");
		System.out.println("!!!!!!");
		System.out.println();
		System.out.println();
		
		System.out.println("Apr�s avoir fait une chute de trois m�tres, vous vous r�veillez quelques peu endolori.");
		System.out.println("Dans l'ombre vous entendez une respiration, un r�le... Il faut sortir d'ici!!!");
	
		Dungeon.entrerDonjonUn();
		
	}
	
	
	
}
