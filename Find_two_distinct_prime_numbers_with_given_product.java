import java.util.Scanner;
class sam
{
    public int pri(int n)
    {
        int i,f=1;
        if (n==1)
        return 0;
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                f=0;
                break;
            }
        }
        return f;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        sam s=new sam();
        int n,i,f=0;
        n=sc.nextInt();
        for(i=1;i<n/2;i++)
        {
            if (i*(n/i)==n && s.pri(i)==1 && s.pri(n/i)==1)
            {
                f=1;
                System.out.print(i+" "+n/i);
                break;
            }
        }
        if(f==0)
        System.out.print(-1);
    }
}