import java.util.Scanner;
class monk
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n,a[],b[],c[],i;
        n=sc.nextInt();
        a=new int[n];
        b=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+b[i]+" ");
        }
    }
}