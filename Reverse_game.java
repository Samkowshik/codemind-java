import java.util.Scanner;
class sam
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,a[],c=0,i,r,d,s;
		n=sc.nextInt();
		a=new int[n];
		for(i=0;i<n;i++)
		{	
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
		    d=a[i];
		    s=0;
			while(d!=0)
			{
			    r=d%10;
			    s=s*10+r;
			    d=d/10;
			}
			System.out.print(s+" ");
		}
	}
}