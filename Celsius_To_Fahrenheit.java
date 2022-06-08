import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        double f,c;
        c=sc.nextInt();
        f=c*1.8+32;
        System.out.printf("%.2f",f);
    }
}