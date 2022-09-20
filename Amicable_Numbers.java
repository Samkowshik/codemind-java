import java.util.Scanner;
class sam
{
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a,b,a1=0,b1=0,i;
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=1;i<a;i++)
        {
            if(a%i==0)
            a1=a1+i;
        }
        for(i=1;i<b;i++)
        {
            if(b%i==0)
            b1=b1+i;
        }
        if(a==b1&&b==a1)
        System.out.println("Amicable");
        else
        System.out.println("Not Amicable");
    }
}