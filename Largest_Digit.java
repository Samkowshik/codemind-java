import java.util.Scanner;
class sam
{
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,r,s,m=0;
        n=sc.nextInt();
        while(n!=0)
        {
            r=n%10;
            m=r>m?r:m;
            n=n/10;
        }
        System.out.println(m);
    }
}