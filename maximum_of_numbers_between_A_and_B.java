import java.util.Scanner;
class sam
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,a[],c=0,x,b,j,i,f=1,m=0;
		n=sc.nextInt();
		a=new int[n];
		for(i=0;i<n;i++)
		{	
			a[i]=sc.nextInt();
		}
		x=sc.nextInt();
		b=sc.nextInt();
		for(i=0;i<n;i++)
		{
		    for(j=x;j<=b;j++)
		    {
		        if(j==a[i])
		        {
		            m=a[i]>m?a[i]:m;
		            f=0;
		        }
		    }
		}
		if(f==1)
		System.out.print("-1");
		else
		System.out.print(m);
	}
}