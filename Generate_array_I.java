import java.util.Scanner;
class sam
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,a[],i,j;
		n=sc.nextInt();
		a=new int[n];
		for(i=0;i<n;i++)
		{	
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i+=2)
		{	
			for(j=1;j<=a[i+1];j++)
			{
			    System.out.print(a[i]+" ");
			}
		}
	}
}