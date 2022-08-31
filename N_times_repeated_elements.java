import java.util.Scanner;
class aryele
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,a[],i,j,c,k,r=0;
		n=sc.nextInt();
		a=new int[n];
		for(i=0;i<n;i++)
		{	
			a[i]=sc.nextInt();
		}
		k=sc.nextInt();
		for(i=0;i<n;i++)
		{
		    if(a[i]==-1)
		    continue;
		    c=1;
		    for(j=0;j<n;j++)
		    {
		        if(i==j)
		        continue;
		        if(a[i]==a[j])
		        {
		            c++;
		            a[j]=-1;
		        }
		    }
		    if(c==k)
		    {
               System.out.print(a[i]+" ");
               r=1;
		    }
		}
		if(r==0)
		System.out.print("-1");
	}
}