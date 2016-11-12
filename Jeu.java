

public class Jeu  {


		
		

	public static void main(String[] args) throws InterruptedException {
		
		Plateau plateau = new Plateau(4);
		int x = plateau.aleaValeur();
		plateau.affiche();
		plateau.generate();
		plateau.affiche();
			}
		
		

	}
