import java.util.Scanner;
class disk
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        long t,s,bl,b;
        t=sc.nextInt();
        sc.nextLine();
        s=sc.nextInt();
        sc.nextLine();
        bl=sc.nextInt();
        b=512*2*t*s*bl;
        System.out.println(b);
    }
}