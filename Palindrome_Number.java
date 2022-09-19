import java.util.Scanner;
class sam
{
    public static int rev(int x)
    {
        int r,d,s=0;
        d=x;
        while(d!=0)
        {
            r=d%10;
            s=s*10+r;
            d=d/10;
        }
        return(s);
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,a[],i;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]==rev(a[i]))
            System.out.println("True");
            else
            System.out.println("False");
        }
    }
}