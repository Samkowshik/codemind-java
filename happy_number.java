import java.util.Scanner;
class sam
{
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,i,r,d,s;
        n=sc.nextInt();
        while(n/10!=0)
        {
            d=n;
            s=0;
            while(d!=0)
            {
                r=d%10;
                s=s+(r*r);
                d=d/10;
            }
            n=s;
        }
        if(1==n)
        System.out.println("True");
        else
        System.out.println("False");
    }
}