import java.util.Scanner;
class sam
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,a[],os=0,es=0,i;
		n=sc.nextInt();
		a=new int[n];
		for(i=0;i<n;i++)
		{	
			a[i]=sc.nextInt();
			if(a[i]%2==0)
			es=es+a[i];
			else
			os=os+a[i];
		}
		if(es>os)
		System.out.print(es-os);
		else
		System.out.print(os-es);
	}
}