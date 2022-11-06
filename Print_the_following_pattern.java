import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,i,j;
        n=sc.nextInt();
        for(i=n;i>0;i--)
        {
            for(j=n;j>0;j--)
            {
                if(i==j || i+j==n+1)
                System.out.print(i+" ");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}