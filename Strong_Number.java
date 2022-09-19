import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,i,r,d,p,s=0;
        n=sc.nextInt();
        d=n;
        while(d!=0)
        {
            p=1;
            r=d%10;
            for(i=1;i<=r;i++)
            {
                p=p*i;
            }
            s=s+p;
            d=d/10;
        }
        if(s==n)
        System.out.print("The number "+n+" is a strong number");
        else
        System.out.print("The number "+n+" is not a strong number");
    }
}