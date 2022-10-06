import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,a[],i,j,c,mfc=0,mf=9999;
        n=sc.nextInt();
        a= new int[n];
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
            if(c>mfc)
            {
                mf=a[i];
                mfc=c;
            }
            if(c==mfc && a[i]<mf)
            {
                mf=a[i];
                mfc=c;
            }
        }
        System.out.println(mf);
    }
}