import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,d,i,r,c,p=0,f=1;
        n=sc.nextInt();
        d=n;
        for(i=0;d!=0;i++)
        {
            r=d%10;
            if(r==6)
            {
               p=i;
               f=0;
            }
            d=d/10;
        }
        if(f==0)
        System.out.print(n+3*(int)Math.pow(10,p));
        else
        System.out.print(n);
    }
}