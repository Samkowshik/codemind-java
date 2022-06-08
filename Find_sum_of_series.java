import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,i;
        double s=0,r;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            r=(double)1/i;
            s=s+r;
        }
        System.out.printf("%.2f",s);
    }
}