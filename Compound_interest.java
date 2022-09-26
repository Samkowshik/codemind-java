import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        double p,t,r,a;
        p=sc.nextDouble();
        r=sc.nextDouble();
        t=sc.nextDouble();
        a=p*Math.pow(1+r/100,t);
        System.out.printf("%.2f",a);
    }
}