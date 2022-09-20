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
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,i,f=0,f1=0;
        n=sc.nextInt();
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                f=1;
                break;
            }
        }
        n=rev(n);
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                f1=1;
                break;
            }
        }
        if(f==0&&f1==0)
        System.out.println("circular prime");
        else if(f==0)
        System.out.println("prime but not a circular prime");
        else
        System.out.println("not prime");
    }
}