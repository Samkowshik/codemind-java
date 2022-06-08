import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        double f,c;
        f=sc.nextInt();
        c=((f-32)*5)/9;
        System.out.printf("%.2f",c);
    }
}