import java.util.Scanner;
class sam
{
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,i,k;
        n=sc.nextInt();
        k=sc.nextInt();
        for(i=1;i<=k;i=i+2)
        {
           System.out.println(n+" x "+i+" = "+(n*i));
        }
    }
}