import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,a[],i,x,y,f=0;
        n=sc.nextInt();
        a= new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        x=sc.nextInt();
        y=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]<x ||a[i]>y)
            {
                f=1;
                System.out.print(a[i]+" ");
            }
            
        }
        if(f==0)
        System.out.print("-1");
    }
}