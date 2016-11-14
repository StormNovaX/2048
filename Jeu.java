import java.util.Scanner;

public class Jeu  {


		
		

	private static Scanner sc;

	public static void main(String[] args) throws InterruptedException {
		
		Plateau plateau = new Plateau(4);
		plateau.generate();
		plateau.generate();
		plateau.affiche();
		int game = 1;
		do{
			sc = new Scanner(System.in);
			String chaine = sc.nextLine();
			char carac = chaine.charAt(0);
			switch(carac){
				case 'z' :
					plateau.haut();
					plateau.generate();
					plateau.affiche();
					
					break;
				case 's' :
					plateau.bas();
					plateau.generate();
					plateau.affiche();
					
					
					break;
				case 'q':
					plateau.gauche();
					plateau.generate();
					plateau.affiche();
					
					break;
				case 'd':
					plateau.droite();
					plateau.generate();
					plateau.affiche();
					
					break;
				default:
					System.out.println("Veuillez appuyez sur la bonne touche");
				}
		
		}while (game ==1);
			}
		
		

	}
