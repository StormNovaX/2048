

public class Plateau {
	
		public int plateau[][]={{0,0,0,0},{2,2,0,0},{2,0,0,0},{0,0,0,0}};
		private int x = 3;
		private int y = 3;
		public void affiche() 
		{
			int i;
			int j;		
			for(i=0; i <=y  ;i++ )
			{
				for(j=0; j <=x; j++)
				{
					if(plateau[i][j]==0)
					{
						System.out.print(" |");
					}else
					System.out.print(plateau[i][j]+"|");
				}
				System.out.println();
			}
		}
		public void haut(){
			int i;
			int j;
			for(i=3;i>=1;i--)
			{
				for(j=0; j<=x; j++)
				{
					if(plateau[i-1][j]==0)
					{
						plateau[i-1][j]=plateau[i][j];
						plateau[i][j]=0;
					}
					else
					{
						if(plateau[i-1][j]==plateau[i][j])
						{
							plateau[i-1][j]=plateau[i-1][j] * 2;
							plateau[i][j]=0;
						}
					}
				}
			}
		}
		public void bas(){
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
