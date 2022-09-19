import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int x,a[],i,c,n,r;
        x=sc.nextInt();
        a=new int[x];
        for(i=0;i<x;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<x;i++)
        {
            n=a[i];
            r=(int)Math.sqrt(n);
            if(r*r==n)
            System.out.println("True");
            else
            System.out.println("False");
        }
    }
}