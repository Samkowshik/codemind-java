import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,d,s=0,r;
        n=sc.nextInt();
        d=n;
        if(n<0)
        n=n*-1;
        while(n%10==0)
        {
            n=n/10;
        }
        while(n!=0)
        {
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        if(d>0)
        System.out.print(s);
        else
        System.out.print(s*-1);
    }
}