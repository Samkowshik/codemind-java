import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,s,x,d,p;
        n= sc.nextInt();
        x=(int)Math.log10(n)+1;
        s=n*n;
        p=(int)Math.pow(10,x);
        d=s%p;
        if(d==n)
        System.out.print("Automorphic Number");
        else
        System.out.print("Not an Automorphic Number");
    }
}