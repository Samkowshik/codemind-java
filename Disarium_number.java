import java.util.Scanner;
class sam
{
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,r,d,x,s=0;
        n=sc.nextInt();
        d=n;
        x=(int)Math.log10(n)+1;
        for(;n!=0;x--)
        {
            r=n%10;
            s=s+(int)Math.pow(r,x);
            n=n/10;
        }
        if(s==d)
        System.out.println("True");
        else
        System.out.println("False");
    }
}