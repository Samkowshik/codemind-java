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
        int n,i,c=0,f;
        n=sc.nextInt();
        n++;
        for(;;n++)
        {
            if(n==1)
            continue;
            f=0;
            for(i=2;i<n;i++)
            {
                if(n%i==0)
                {
                    f=1;
                    break;
                }
            }
            if(f==0)
            {
                if(n==rev(n))
                {
                    System.out.print(n);
                    break;
                }
            }
        }
    }
}