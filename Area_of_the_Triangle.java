import java.util.Scanner;
class tri
{
    public static void main(String[] args)
    {
        double a,b,c,s,r;
        Scanner sc = new Scanner(System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        s=(a+b+c)/2;
        r=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",r);
    }
}