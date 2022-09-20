import java.util.Scanner;
class sam
{
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,i,p=1;
        n=sc.nextInt();
        for(i=1;p<n;i++)
        {
            p=i*(i+1);
        }
        if(p==n)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}