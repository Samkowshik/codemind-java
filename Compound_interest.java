import java.util.Scanner;
class sam
{
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        double a,p,t,r;
        p=sc.nextInt();
        r=sc.nextInt();
        t=sc.nextInt();
        a=p*Math.pow((1+r/100),t);
        System.out.printf("%.2f",a);
    }
}