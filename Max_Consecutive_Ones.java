import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,i,a[],c=0,mc=0;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]==1)
            {
                c++;
                mc=c>mc?c:mc;
            }
            else
            c=0;
        }
        System.out.print(mc);
    }
}