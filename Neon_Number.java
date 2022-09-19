import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,r,d,sq,s=0;
        n=sc.nextInt();
        sq=n*n;
        while(sq!=0)
        {
            r=sq%10;
            s=s+r;
            sq=sq/10;
        }
        if(s==n)
        System.out.print("Neon Number");
        else
        System.out.print("Not Neon Number");
    }
}