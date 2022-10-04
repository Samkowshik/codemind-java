import java.util.Scanner;
class sam
{
    public static int rev(int n)
    {
        int r,s=0;
        while(n>0)
        {
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        return s;
    }
    public static int pri(int n)
    {
        int i,f=0;
        for(i=2;i<n;i++)
        {
            if(n==1)
            continue;
            if(n%i==0)
            {
                f=1;
                break;
            }
        }
        return f;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,r;
        n=sc.nextInt();
        r=rev(n);
        if(pri(n)==0&&pri(r)==0)
        System.out.println("circular prime");
        else if(pri(n)==0&&pri(r)!=0)
        System.out.println("prime but not a circular prime");
        else
        System.out.println("not prime");
    }
}