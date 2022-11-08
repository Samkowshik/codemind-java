import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,m,i,a[],b[],x,c=0;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        a[i]=sc.nextInt();
        m=sc.nextInt();
        b=new int[m];
        for(i=0;i<n;i++)
        b[i]=sc.nextInt();
        x=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(x>=a[i] && x<=b[i])
            c++;
        }
        System.out.print(c);
    }
}