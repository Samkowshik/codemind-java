import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,a[],i,k,c=0,f=0;
        n=sc.nextInt();
        k=sc.nextInt();
        a= new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(f==1)
            break;
            if(a[i]<=k)
            c++;
            else
            f=1;
        }
        for(;i<n;i++)
        {
            if(f==0)
            break;
            if(a[i]<=k)
            c++;
            else
            f=0;
        }
        System.out.println(c);
    }
}