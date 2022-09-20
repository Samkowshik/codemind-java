import java.util.Scanner;
class sam
{
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,a[],i,j,c,m=0,l;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            m=a[i]>m?a[i]:m;
        }
        for(j=1;;j++)
        {
            c=0;
            l=m*j;
            for(i=0;i<n;i++)
            {
                if(l%a[i]==0)
                c++;
            }
            if(c==n)
            {
                System.out.println(l);
                break;
            }
        }
    }
}