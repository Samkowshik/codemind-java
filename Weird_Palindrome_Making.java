import java.util.Scanner;
class s
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int t,n,a[],i,j,c;
        t=sc.nextInt();
        for(i=0;i<t;i++)
        {
            c=0;
            n=sc.nextInt();
            a= new int[n];
            for(j=0;j<n;j++)
            {
                a[j]=sc.nextInt();
                if(a[j]%2!=0)
                {
                    c++;
                }
            }
           System.out.println(c/2);
        }
    }
}