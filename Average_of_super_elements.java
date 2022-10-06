import java.util.Scanner;
class saam
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,a[],i,j,c=0,f=0;
        double avg,s=0,c1=0;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]==-1)
            continue;
            c=1;
            for(j=0;j<n;j++)
            {
                if(a[i]==a[j] && i!=j)
                {
                    c++;
                    a[j]=-1;
                }
            }
            if(a[i]==c)
            {
                s=s+a[i];
                c1++;
                f=1;
            }
        }
        avg=s/c1;
        if(f==1)
        System.out.printf("%.2f",avg);
        else
        System.out.println(-1);
    }
}