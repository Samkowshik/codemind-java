import java.util.Scanner;
class sam
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,a[],s=0,i;
		n=sc.nextInt();
		a=new int[n];
		for(i=0;i<n;i++)
		{	
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
		    if(a[i]%2==0)
		    break;
			s=s+a[i];
		}
		System.out.print(s);
	}
}