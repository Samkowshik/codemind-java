import java.util.Scanner;
class sam
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,a[],c=0,f,j,i;
		n=sc.nextInt();
		a=new int[n];
		for(i=0;i<n;i++)
		{	
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
		    f=0;
		    if(a[i]==-1 || a[i]%2==0)
			continue;
			for(j=0;j<n;j++)
			{
			    if(a[i]==a[j] && i!=j)
			    {
			        a[j]=-1;
			        f=1;
			    }
			}
			c++;
		}
		System.out.print(c);
	}
}