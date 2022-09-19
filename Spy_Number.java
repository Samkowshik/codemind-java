import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,r,d,p=1,s=0;
        n=sc.nextInt();
        while(n!=0)
        {
            r=n%10;
            s=s+r;
            p=p*r;
            n=n/10;
        }
        if(s==p)
        System.out.print("Spy Number");
        else
        System.out.print("Not Spy Number");
    }
}