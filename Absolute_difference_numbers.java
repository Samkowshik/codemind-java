import java.util.Scanner;
class sam
{
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,k,x,a,b;
        n=sc.nextInt();
        k=sc.nextInt();
        x=(int)Math.log10(n)+1;
        a=n/(int)Math.pow(10,(x-k));
        b=n%(int)Math.pow(10,k);
        if(a>b)
        System.out.println(a-b);
        else
        System.out.println(b-a);
    }
}