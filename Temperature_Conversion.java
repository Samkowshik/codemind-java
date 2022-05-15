import java.util.Scanner;
class temp
{
    public static void main(String[] args)
    {
        double f,c;
        Scanner sc = new Scanner(System.in);
        c=sc.nextInt();
        f=32+(c*9/5);
        System.out.printf("%.2f",f);
    }
}