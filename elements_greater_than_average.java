import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,a[],i,s=0,avg,c=0;
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
            if(a[i]>=avg)
            c++;
        }
        System.out.print(c);
    }
}