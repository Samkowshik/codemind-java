import java.util.Scanner;
class sam
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,m,a[],b[],f,i,j;
		n=sc.nextInt();
		m=sc.nextInt();
		a=new int[n];
		b=new int[m];
		for(i=0;i<n;i++)
		{	
			a[i]=sc.nextInt();
		}
		for(i=0;i<m;i++)
		{	
			b[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{	
		    f=0;
			for(j=0;j<m;j++)
			{
			    if(a[i]==b[j])
			    {
			        f=1;
			    }
			}
			if(f==0)
			System.out.print(a[i]+" ");
		}
		for(i=0;i<m;i++)
		{	
		    f=0;
			for(j=0;j<n;j++)
			{
			    if(b[i]==a[j])
			    {
			        f=1;
			    }
			}
			if(f==0)
			System.out.print(b[i]+" ");
		}
	}
}