import java.util.Scanner;

public class Jeu  {


		
		

	private static Scanner sc;

	public static void main(String[] args) throws InterruptedException {
		
		Plateau plateau = new Plateau(4);
		plateau.generate();
		plateau.generate();
		plateau.affiche();
		plateau.haut();
		plateau.affiche();
		plateau.rotate();
		plateau.affiche();
		sc = new Scanner(System.in);
		String chaine = sc.nextLine();
		char carac = chaine.charAt(0);
		switch(carac){
		case 'z' :
			plateau.haut();
			break;
		default:
			System.out.println("Veuillez appuyez sur la bonne touche");
		}
			}
		
		

	}
