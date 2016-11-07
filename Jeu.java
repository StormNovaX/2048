import java.util.Scanner;

public class Jeu extends Plateau {


		
		

	public static void main(String[] args) throws InterruptedException {
		Plateau plateau = new Plateau();
		plateau.affiche();
		int game = 1;
		Scanner sc = new Scanner(System.in);
		String str =  sc.nextLine();
		while(game==1){
			
			if(str == "h"){
				plateau.haut();
				plateau.haut();
				plateau.affiche();
			}
			if(str == "b"){
				plateau.bas();
				plateau.bas();
				plateau.affiche();
			}
			if(str == "g"){
				plateau.gauche();
				plateau.gauche();
				plateau.affiche();
			}
			if(str == "d"){
				plateau.droite();
				plateau.droite();
				plateau.affiche();
			}
		}
		
		

	}

}
