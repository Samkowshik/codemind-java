import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,m,i,j,a[],b[],f,c=0;
        n=sc.nextInt();
        m=sc.nextInt();
        a=new int[n];
        b=new int[m];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<m;i++)
        {
            b[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(a[i]==a[j] && i!=j)
                a[j]=-1;
            }
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                if(b[i]==b[j] && i!=j)
                b[j]=-1;
            }
        }
        for(i=0;i<n;i++)
        {
            if(a[i]==-1)
            continue;
            for(j=0;j<m;j++)
            {
                if(a[i]==b[j])
                System.out.print(a[i]+" ");
            }
        }
    }
}