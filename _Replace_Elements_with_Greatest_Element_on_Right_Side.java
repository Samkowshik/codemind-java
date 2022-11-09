import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,i,j,a[],m;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(i=0;i<n-1;i++)
        {
            m=a[i+1];
            for(j=i+1;j<n;j++)
            {
                m=a[j]>m?a[j]:m;
            }
            a[i]=m;
        }
        for(i=0;i<n-1;i++)
        System.out.print(a[i]+" ");
        System.out.print(-1);
    }
}