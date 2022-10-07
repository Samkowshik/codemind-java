import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,i,j;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(i==j ||j==n-i+1)
                System.out.print("x");
                else
                System.out.print("0");
            }
            System.out.println();
        }
    }
}