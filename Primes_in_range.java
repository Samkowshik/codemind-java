import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n1,n2,n,i,f,c=0;
        n1=sc.nextInt();
        n2=sc.nextInt();
        for(n=n1;n<=n2;n++)
        {
            f=1;
            if (n==1)
            continue;
            for(i=2;i<=Math.sqrt(n);i++)
            {
                if (n%i==0)
                {
                    f=0;
                    break;
                }
            }
            if(f==1)
            c++;
        }
        System.out.print(c);
    }
}