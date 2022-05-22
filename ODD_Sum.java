import java.util.Scanner;
class odd
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,i,s=0,a[];
        n=sc.nextInt();
        a= new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]%2!=0)
            {
                s=s+a[i];
            }
        }
        System.out.print(s);
    }
}