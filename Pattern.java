import java.util.Scanner;
class sam
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,j,i;
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
		    for(j=1;j<=n;j++)
		    {
		        System.out.print(i+" ");
		    }
			System.out.print("
");
		}
	}
}