import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n1,n2,n,i,c=0,f;
        n1=sc.nextInt();
        n2=sc.nextInt();
        for(n=n1;n<=n2;n++)
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
            System.out.println(n);
        }
    }
}