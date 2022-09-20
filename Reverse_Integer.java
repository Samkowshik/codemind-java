import java.util.Scanner;
class sam
{
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,i,d,r,s=0;
        n=sc.nextInt();
        d=n;
        if(d<0)
        d=d*-1;
        while(d%10==0)
        {
            d=d/10;
        }
        while(d!=0)
        {
            r=d%10;
            s=s*10+r;
            d=d/10;
        }
        if(n<0)
        System.out.println(s*-1);
        else
        System.out.println(s);
    }
}