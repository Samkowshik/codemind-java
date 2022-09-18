import java.util.Scanner;
class sam
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,a[],k,s1=0,s=0,i;
		n=sc.nextInt();
		a=new int[n];
		for(i=0;i<n;i++)
		{	
			a[i]=sc.nextInt();
			s1=s1+a[i];
		}
		for(i=0;i<n/2;i++)
		{	
			s=s+a[i];
		}
		System.out.print(s+"
"+(s1-s));
	}
}