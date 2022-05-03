import java.util.Scanner;
class fib
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        int n,s,s1=0,s2=1,i;
        n=sc.nextInt();
        System.out.print("0 1 ");
        for(i=n-2;i>0;i--)
        {
            s=s1+s2;
            System.out.print(s+" ");
            s1=s2;
            s2=s;
        }
    }
}