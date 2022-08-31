import java.util.Scanner;
class aryele
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,a[],i,j;
		n=sc.nextInt();
		a=new int[n];
		for(i=0;i<n;i++)
		{	
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
		    for(j=0;j<n;j++)
		    {
		        if(i==j)
		        continue;
		        if(a[i]==a[j])
		        {
		            a[j]=-1;
		        }
		    }
		    if(a[i]!=-1)
		    {
               System.out.print(a[i]+" ");
		    }
		}
	}
}