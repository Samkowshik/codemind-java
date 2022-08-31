import java.util.Scanner;
class sam
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,a[],x,y,i,j,m=0,k,r=0;
		n=sc.nextInt();
		a=new int[n];
		for(i=0;i<n;i++)
		{	
			a[i]=sc.nextInt();
		}
		x=sc.nextInt();
		y=sc.nextInt();
		for(i=1;i<n;i++)
		{
		    k=0;
		    for(j=x;j<=y;j++)
		    {
		        if(a[i]==j)
		        k=1;
		    }
		    if(k==0)
		    {
		        m=a[i]>m?a[i]:m;
		        r=1;
		    }
		}
		if(r==0)
		System.out.print("-1");
		else
		System.out.print(m);
	}
}