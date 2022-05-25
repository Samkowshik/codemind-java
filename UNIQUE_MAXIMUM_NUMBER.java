import java.util.Scanner;
class k
{
    public static void main(String[] args)
    {
        int n,a[],i,j,f,m=0,r=0;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            f=0;
            for(j=0;j<n;j++)
            {
                if(i==j)
                continue;
                if(a[i]==a[j])
                f=1;
            }
            if(f==0)
            {
                m=a[i]>m?a[i]:m;
                r=1;
            }
        }
        if(r==1)
        {
            System.out.println(m);
        }
        else
        {
            System.out.println("-1");
        }
    }
}