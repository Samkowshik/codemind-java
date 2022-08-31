import java.util.Scanner;
class aryele
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,a[],i,c=0;
		n=sc.nextInt();
		a=new int[n];
		for(i=0;i<n;i++)
		{	
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				c++;
			}
		}
		if(c==n)
		System.out.print("True");
		else
		System.out.print("False");
	}
}