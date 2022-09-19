import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n1,n2,n,i,c,f;
        n1=sc.nextInt();
        n2=sc.nextInt();
        for(n=n1;n<=n2;n++)
        {
            f=1;
            if(n==1)
            continue;
            for(i=2;i<n;i++)
            {
                if(n%i==0)
                {
                    f=0;
                    break;
                }
            }
            if(f==1)
            System.out.println(n);
        }
    }
}