import java.util.Scanner;
class aryele
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,a[],i,j,c,c1=0;
		n=sc.nextInt();
		a=new int[n];
		for(i=0;i<n;i++)
		{	
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
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
		    if(a[i]==c)
		    {
               c1++;
		    }
		}
		System.out.print(c1);
	}
}