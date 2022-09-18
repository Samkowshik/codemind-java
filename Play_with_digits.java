import java.util.Scanner;
class sam
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,a[],s=0,r,d,i;
		n=sc.nextInt();
		a=new int[n];
		for(i=0;i<n;i++)
		{	
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
		    d=a[i];
			while(d!=0)
			{
			    r=d%10;
			    s=s+r;
			    d=d/10;
			}
		}
		System.out.print(s);
	}
}