import java.util.Scanner;
class sam
{
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,i,s=0,s1=0,s2=1;
        n=sc.nextInt();
        System.out.print("0 1 ");
        for(i=2;i<n;i++)
        {
            s=s1+s2;
            System.out.print(s+" ");
            s1=s2;
            s2=s;
        }
    }
}