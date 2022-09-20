import java.util.Scanner;
class sam
{
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,i,r;
        n=sc.nextInt();
        r=(int)Math.sqrt(n);
        if(r*r==n)
        System.out.println("True");
        else
        System.out.println("False");
    }
}