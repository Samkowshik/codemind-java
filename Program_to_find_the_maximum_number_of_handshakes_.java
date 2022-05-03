import java.util.Scanner;
class handshake
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,h;
        n=sc.nextInt();
        n--;
        h=(n*(n+1))/2;
        System.out.println(h);
    }
}