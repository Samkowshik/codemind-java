import java.util.Scanner;
class sam
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,j,i;
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
		    for(j=0;j<n;j++)
		    {
		        if(i==j)
		        System.out.print(0);
		        else
		        System.out.print("x");
		    }
			System.out.print("
");
		}
	}
}