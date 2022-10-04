import java.util.Scanner;
class sam
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,i,j,a[],f,c=0,k;
        n=sc.nextInt();
        a= new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        k=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]==1||a[i]==0)
            continue;
            f=0;
            for(j=2;j<a[i];j++)
            {
                if(a[i]%j==0)
                {
                    f=1;
                    break;
                }
            }
            if(f==0&&a[i]<=k)
            c++;
        }
        System.out.println(c);
    }
}