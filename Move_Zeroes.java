import java.util.Scanner;
class ass
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int n,x[],i,j;
		n=sc.nextInt();
		x=new int[n];
		for(i=0;i<n;i++)
		{
			x[i]=sc.nextInt();
		}
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(x[j]==0)
				{
					int t;
					t=x[j];
					x[j]=x[j+1];
					x[j+1]=t;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.print(x[i]+" ");
		}
	}
}