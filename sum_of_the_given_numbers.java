import java.util.Scanner;
class sam
{
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,i,a[],x,y;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            x=sc.nextInt();
            y=sc.nextInt();
            System.out.println(x+y);
        }
    }
}