import java.util.Scanner;
class des
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,i,a[],f=0;
        n=sc.nextInt();
        a= new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=1;i<n;i++)
        {
            if(a[i-1]<a[i])
            {
                f=1;
                break;
            }
        }
        if(f==0)
        System.out.print("yes");
        else
        System.out.print("no");
    }
}