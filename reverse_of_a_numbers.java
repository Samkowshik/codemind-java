import java.util.Scanner;
class sam
{
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,r,s=0;
        n=sc.nextInt();
        while(n!=0)
        {
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        System.out.println(s);
    }
}