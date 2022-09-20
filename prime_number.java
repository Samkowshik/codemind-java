import java.util.Scanner;
class sam
{
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,i,c,f=1;
        n=sc.nextInt();
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                f=0;
                break;
            }
        }
        if(f==1)
        System.out.println("prime");
        else
        System.out.println("not a prime");
    }
}