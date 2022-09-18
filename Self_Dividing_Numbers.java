import java.util.Scanner;
class sam
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c,n,i,d,r;
		a=sc.nextInt();
		b=sc.nextInt();
		for(i=a;i<=b;i++)
		{
		    if(i%10==0)
		    continue;
		    d=i;
		    c=0;
		    n=(int)Math.log10(d)+1;
			while(d!=0)
			{
			    r=d%10;
			    if(i%r==0)
			    c++;
			    d=d/10;
			}
			if(n==c)
			System.out.print(i+" ");
		}
	}
}