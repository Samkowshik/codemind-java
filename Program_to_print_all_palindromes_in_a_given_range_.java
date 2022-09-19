import java.util.Scanner;
class sam
{
    public static int rev(int i)
    {
        int r,s=0,d;
        d=i;
        while(d!=0)
        {
            r=d%10;
            s=s*10+r;
            d=d/10;
        }
        return s;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n1,n2,i,c;
        n1=sc.nextInt();
        n2=sc.nextInt();
        for(i=n1;i<=n2;i++)
        {
            if(i==rev(i))
            System.out.print(i+" ");
        }
    }
}