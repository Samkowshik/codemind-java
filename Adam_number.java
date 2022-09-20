import java.util.Scanner;
class sam
{
    public static int rev(int n)
    {
        int r,s=0;
        while(n!=0)
        {
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        return s;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,r,sq,sq1;
        n=sc.nextInt();
        sq=n*n;
        r=rev(n);
        sq1=r*r;
        if(sq==rev(sq1))
        System.out.println("True");
        else
        System.out.println("False");
    }
}