import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        int n,i,j,c,m=0,p=0,a[];
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        a= new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]==-1)
            continue;
            c=0;
            for(j=0;j<n;j++)
            {
                if(a[i]==a[j]&& i!=j)
                {
                    c++;
                    a[j]=-1;
                }
            }
            if(c>m)
            {
                m=c;
                p=i;
            }
        }
        System.out.print(a[p]);
    }
}