

import java.util.ArrayList;

public class Plateau {
	
//		public int plateau[][]={{0,0,0,0},{2,2,0,0},{2,0,0,0},{0,0,0,0}};
//		private int x = 3;
//		private int y = 3;
	
		ArrayList<ArrayList<Integer>> plateau = new ArrayList<ArrayList<Integer>>();		
		private int taille;
		public Plateau(int taille){
			this.taille=taille;
			for(int j =0;j<taille;j++){
				plateau.add(j, new ArrayList<Integer>());
				for(int i=0; i<taille;i++){
					plateau.get(j).add(i,0);
					
				}
			}
		}
		public int getValeur(int x, int y){
			return plateau.get(y).get(x);
		}
		public void setValeur(int x, int y, int valeur){
			plateau.get(y).set(x, valeur);
		}
		public void affiche() 
		{
			int i;
			int j;		
			for(i=0; i <taille  ;i++ )
			{
				for(j=0; j <taille; j++)
				{
					if(getValeur(j,i)==0)
					{
						System.out.print(" |");
					}else
					System.out.print(getValeur(j,i)+"|");
				}
				System.out.println();
			}
		}
		
		public void haut(){
			int i;
			int j;
			for(i=taille-1;i>=1;i--)
			{
				for(j=0; j<taille; j++)
				{
					if(getValeur(j,i-1)==0)
					{
						setValeur(j,i-1,getValeur(j,i));
						setValeur(j,i-1,0);
					}
					else
					{
						if(getValeur(j,i-1)==getValeur(j,i))
						{
							setValeur(j,i-1,getValeur(j,i) * 2);
							setValeur(j,i-1,0);
						}
					}
				}
			}
		}		public void bas(){
			int i;
			int j;
			for(i=0;i<=2;i++)
			{
				for(j=0; j<=x; j++)
				{
					if(plateau[i+1][j]==0)
					{
						plateau[i+1][j]=plateau[i][j];
						plateau[i][j]=0;
					}
					else
					{
						if(plateau[i+1][j]==plateau[i][j])
						{
							plateau[i+1][j]=plateau[i+1][j] * 2;
							plateau[i][j]=0;
						}
					}
				}
			}
		}
		public void gauche(){
			int i;
			int j;
			for(i=0;i<=y;i++)
			{
				for(j=3; j>=1; j--)
				{
					if(plateau[i][j-1]==0)
					{
						plateau[i][j-1]=plateau[i][j];
						plateau[i][j]=0;
					}
					else
					{
						if(plateau[i][j-1]==plateau[i][j])
						{
							plateau[i][j-1]=plateau[i][j-1] * 2;
							plateau[i][j]=0;
						}
					}
				}
			}
		}
		public void droite(){
			int i;
			int j;
			for(i=0;i<=y;i++)
			{
				for(j=0; j<=x; j++)
				{
					if(plateau[i+1][j]==0)
					{
						plateau[i+1][j]=plateau[i][j];
						plateau[i][j]=0;
					}
					else
					{
						if(plateau[i+1][j]==plateau[i][j])
						{
							plateau[i+1][j]=plateau[i+1][j] * 2;
							plateau[i][j]=0;
						}
					}
				}
			}
		}
}
