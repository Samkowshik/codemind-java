import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int x,y,m,p;
        x=sc.nextInt();
        y=sc.nextInt();
        m=sc.nextInt();
        p=(int)Math.pow(x,y);
        System.out.print(p%m);
    }
}