import java.util.Scanner;
class sam
{
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,r,s=0,d;
        n=sc.nextInt();
        d=n;
        while(d!=0)
        {
            r=d%10;
            s=s*10+r;
            d=d/10;
        }
        if(s==n)
        System.out.println("True");
        else
        System.out.println("False");
    }
}