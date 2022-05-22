import java.util.Scanner;
class pat
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n,i,j;
        n=sc.nextInt();
        if(n>2&&n<=100)
        {
            for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=n-1;i>0;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        }
        else
        {
        System.out.println("The pattern is not possible");
        }
    }
}