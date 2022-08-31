import java.util.Scanner;
class sam
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,a[],i,c=0;
		n=sc.nextInt();
		a=new int[n];
		for(i=0;i<n;i++)
		{	
			a[i]=sc.nextInt();
		}
		int b[];
		b=new int[n+2];
		b[0]=a[n-1];
		for(i=0;i<n;i++)
		{
		    b[i+1]=a[i];
		}
		b[n+1]=a[0];
		for(i=1;i<n+1;i++)
		{
		    if((b[i-1]%2==0 && b[i+1]%2!=0)||(b[i-1]%2!=0 && b[i+1]%2==0))
		    c++;
		}
		System.out.print(c);
	}
}