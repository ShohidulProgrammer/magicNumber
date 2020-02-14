package magicNumber;
import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,i,j;
		System.out.print("Enter the Magic Square Number: ");
		n=sc.nextInt();
		int num[][]=new int [n+1][n+1];
		
		for(i=0;i<=n;i++)
		{
			for( j=0;j<=n;j++)
			{
				
				if(i==0)
				{
					if(j==n)
					{
						num[i][j]=-3;
					}
					else
						num[i][j]=-2;
				}
				else {
					if(j==n)
						num[i][j]=-1;
					else
						num[i][j]=0;
				}
					
				//System.out.print(num[i][j]);
				//System.out.print(" ");
			}
			//System.out.println("\n");
		}
		
		int m=1;
		i=1;
		j=n/2;
		num[i][j]=m;
		
		for(m=2;m<=n*n;m++)
		//while(m!=(n*n))
		{		
			i=i-1;
			j=j+1;
			//m++;
			if(num[i][j]==-1)
			{
				j=0;
			}
			else if(num[i][j]==-2)
			{
				i=n;
				
			}
			else if((num[i][j]!=0)||(num[i][j]==-3))
			{
				
					i=i+2;
					j=j-1;				
			}
			
				
			num[i][j]=m;
			
		}
		for(i=1;i<=n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(num[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
