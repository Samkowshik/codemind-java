import java.util.Scanner;
class avg
{
    public static void main(String[] args)
    {
        double a,b;
        double x;
        Scanner sc = new Scanner(System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        x=(a+b)/2;
        System.out.printf("%.4f",x);
    }
}