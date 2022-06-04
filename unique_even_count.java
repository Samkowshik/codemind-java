import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,a[],i,j,c=0;
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
            for(j=0;j<n;j++)
            {
                if(a[i]==a[j] && i!=j)
                {
                    a[j]=-1;
                }
            }
            if(a[i]%2==0)
            {
                c++;
            }
        }
        System.out.print(c);
    }
}