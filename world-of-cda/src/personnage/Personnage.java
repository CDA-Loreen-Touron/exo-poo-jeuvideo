package personnage;

public abstract class Personnage {

	public final int id;
	public static int cpt;
	
	
	public int getId() {
		return id;
	}


	public static int getCpt() {
		return cpt;
	}


	public Personnage() {
		this.id= cpt;
		this.cpt=++cpt;
	}
	
	
}
