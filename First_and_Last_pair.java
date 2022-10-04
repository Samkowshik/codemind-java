import java.util.Scanner;
class sam
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,i,j,a[];
        n=sc.nextInt();
        a= new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n/2;i++)
        {
            System.out.print(a[i]+" ");
            System.out.print(a[n-i-1]+" ");
        }
        if(n%2!=0)
        System.out.print(a[n/2]+" "+0);
    }
}