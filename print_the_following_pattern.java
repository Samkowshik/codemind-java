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
            for(j=i;j>0;j--)
            {
                System.out.printf("%c ",64+i);
            }
            System.out.println();
        }
    }
}