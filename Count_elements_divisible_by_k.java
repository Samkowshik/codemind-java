import java.util.Scanner;
class sam
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,a[],k,c=0,i;
		n=sc.nextInt();
		k=sc.nextInt();
		a=new int[n];
		for(i=0;i<n;i++)
		{	
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{	
			if(a[i]%k==0)
			c++;
		}
		System.out.print(c);
	}
}