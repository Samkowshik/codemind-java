import java.util.Scanner;
class sam
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,a[],c=0,i;
		n=sc.nextInt();
		a=new int[n];
		for(i=0;i<n;i++)
		{	
			a[i]=sc.nextInt();
		}
		for(i=2;i<n-1;i++)
		{	
			if(a[i]==a[i-1]+a[i-2])
			c++;
		}
		if(c==n-3)
		System.out.print("yes");
		else
		System.out.print("no");
	}
}