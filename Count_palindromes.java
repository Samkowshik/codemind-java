import java.util.Scanner;
class pal
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,i,a[],r,s,d,c=0;
        n=sc.nextInt();
        a= new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            d=a[i];
            s=0;
            while(d>0)
            {
                r=d%10;
                s=s*10+r;
                d=d/10;
            }
            if(s==a[i])
            c++;
        }
        System.out.println(c);
    }
}