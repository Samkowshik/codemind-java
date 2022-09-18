import java.util.Scanner;
class sam
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,a[],oc=0,ec=0,i;
		n=sc.nextInt();
		a=new int[n];
		for(i=0;i<n;i++)
		{	
			a[i]=sc.nextInt();
			if(i%2==0)
			ec=ec+a[i];
			else
			oc=oc+a[i];
		}
		if(ec>oc)
		System.out.print(ec-oc);
		else
		System.out.print(oc-ec);
	}
}