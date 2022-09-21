import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,a[],i,m=999999,x,c=0;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]==0)
            a[i]=1;
            if(a[i]<0)
            a[i]=-1*a[i];
        }
        for(i=0;i<n;i++)
        {
            x=(int)Math.log10(a[i])+1;
            m=x<m?x:m;
        }
        for(i=0;i<n;i++)
        {
            x=(int)Math.log10(a[i])+1;
            if(x==m)
            c++;
        }
        System.out.println(c);
    }
}