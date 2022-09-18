import java.util.Scanner;
class sam
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t,l,r,c=0,i,j;
		t=sc.nextInt();
		for(j=1;j<=t;j++)
		{
		    c=0;
		    l=sc.nextInt();
		    r=sc.nextInt();
		    for(i=l;i<=r;i++)
		    {	
		        if(i%10==2||i%10==3||i%10==9)
		        c++;
		    }
		    System.out.println(c);
		}
	}
}