import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,a[],i,s=0,avg,f=0;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            s=s+a[i];
        }
        avg=s/n;
        for(i=0;i<n;i++)
        {
            if(avg==a[i])
            {
                f=1;
                break;
            }
        }
        if(f==1)
        System.out.print("True");
        else
        System.out.print("False");
    }
}