import java.util.Scanner;
class sam
{
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,i,s=0,s1=0,s2=1;
        n=sc.nextInt();
        for(i=1;s<n;i++)
        {
            s=s1+s2;
            s1=s2;
            s2=s;
        }
        if(s==n)
        System.out.println("True");
        else
        System.out.println("False");
    }
}