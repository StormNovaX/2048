

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
			return plateau.get(x).get(y);
		}
		public int alea(){
			return (int) (Math.random()*4);
		}
		public int aleaValeur(){
			if( (float) (Math.random()) < 0.9)
				return 2;
			else
				return 4;
		}
		public void setValeur(int x, int y, int valeur){
			plateau.get(x).set(y, valeur);
		}
		public void generate(){
			int test = 1;
			int a,b;
			while(test !=0){				
				a = alea();
				b = alea();
				if (plateau.get(a).get(b) == 0){
					plateau.get(a).set(b,aleaValeur());
					test = 0;
				}
			}
		}
		public void mouvement(int i, int j){
			setValeur(i-1,j,getValeur(i,j));
			setValeur(i,j,0);
		}
		public void fusion(int i, int j){
			setValeur(i,j-1,getValeur(i,j) * 2);
			setValeur(i,j-1,0);
		}
		public void affiche() 
		{
			int i;
			int j;		
			for(i=0; i <taille  ;i++ )
			{
				for(j=0; j <taille; j++)
				{
					if(getValeur(i,j)==0)
					{
						System.out.print(" |");
					}else
					System.out.print(getValeur(i,j)+"|");
				}
				System.out.println();
			}
		}
		
		public void haut(){
			int i;
			int j;
			for(i=taille-1;i>0;i--)
			{
				for(j=0; j<taille; j++)
				{
					if(getValeur(i-1,j)==0)
					{
						mouvement(i,j);
					}
					else
					{
						if(getValeur(i-1,j)==getValeur(i,j))
						{
							fusion(i,j);
						}
					}
				}
			}
		}
}/*		public void bas(){
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
}*/
