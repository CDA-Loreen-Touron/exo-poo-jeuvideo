package scenario;

import java.util.Scanner;

import dungeon.Dungeon;
import personnage.Joueur;

public abstract class Scenario {

	public static void lireScenario() {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("/n ********      WORLD OF CDA **********");
		System.out.println("Une légende raconte, qu'en l'an 1365 de l'ère JAHAVA, un être sera capable de trouver la réponse à l'algirythme ultime. ");
		System.out.println("Le moment est enfin arrivé pour le pays d'Afpa de retrouver et sauver cette personne.");
		System.out.println("");
		System.out.println("...");
		System.out.println();
		System.out.println(".........");
		System.out.println("EMASI: Bonjour tout le monde. J'espère que vous allez tous bien.");
		System.out.println("EMASI: Très bien! Je vois que tout le monde est en forme. Par contre jze ne t'ai pas encore entendu...");
		
		System.out.println();
		System.out.println("Saisissez votre nom");
		String vNomjoueur =sc.nextLine();
		
		System.out.println("EMASI: Oui! C'est ça. "+vNomjoueur+"! J'avais oublié. J'ai justeent un petit coup de main à te demander.");
		System.out.println("EMASI: Certains ont choisi le chemin des armes et d'autres celui des arcanes.");
		System.out.println("EMASI: Quel chemin choisis tu de suivre?");
		System.out.println("***********");
		System.out.println();
		
		String vCLasseJoueur = sc.nextLine();
		
		Joueur.creerJoueur(vNomjoueur, vCLasseJoueur);
		
		
		System.out.println("EMASI: Très bien! Il semble que quelqu'un ait volé le grimoire de Madame Céhée Cesse.");
		System.out.println("EMASI: Les traces mènent au manoire de la jetée aimelle.");
		System.out.println("EMASI: S'il te plait, va voir si tu y trouves quelques chose.");
		System.out.println();
		System.out.println();
		
		System.out.println("******* Chapitre un : Une étrange découverte. *******");
		
		System.out.println("******* Après avoir quitté la ville d'Ewi, vous vous engagez dans la forêt de Thifé.");
		System.out.println("Rapidement, la végétation se fait plus dense, plus sombre.");
		System.out.println();
		System.out.println("Un denier rayon de soleil perce à travers le feuillage des chênes quand...");
		System.out.println("!!!!!!");
		System.out.println();
		System.out.println();
		
		System.out.println("Après avoir fait une chute de trois mètres, vous vous réveillez quelques peu endolori.");
		System.out.println("Dans l'ombre vous entendez une respiration, un râle... Il faut sortir d'ici!!!");
	
		Dungeon.entrerDonjonUn();
		
	}
	
	
	
}
