import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int l,b,w,c,a;
        l=sc.nextInt();
        b=sc.nextInt();
        w=sc.nextInt();
        c=sc.nextInt();
        a=((l+2*w)*(b+2*w))-(l*b);
        System.out.print((a*c));
    }
}