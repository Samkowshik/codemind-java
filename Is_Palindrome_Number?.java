import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,d,r,s=0;
        n= sc.nextInt();
        d=n;
        while(n!=0)
        {
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        if(d==s)
        System.out.println("2");
        else
        System.out.println("1");
    }
}