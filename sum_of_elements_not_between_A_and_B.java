import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,a[],i,j,s=0,x,y,k;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        x=sc.nextInt();
        y=sc.nextInt();
        for(i=0;i<n;i++)
        {
            k=0;
            for(j=x;j<=y;j++)
            {
                if(a[i]==j)
                k=1;
            }
            if(k==0)
            s=s+a[i];
        }
        System.out.println(s);
    }
}