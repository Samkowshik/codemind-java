import java.util.Scanner;
class sam
{
    public static int rev(int x)
    {
        int d,s=0,r;
        d=x;
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
        int x;
        Scanner sc= new Scanner(System.in);
        x= sc.nextInt();
        x=x+rev(x);
        while(x!=rev(x))
        {
            x=x+rev(x);
        }
        System.out.print(x);
    }
}