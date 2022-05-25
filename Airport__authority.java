import java.util.Scanner;
class k
{
    public static void main(String[] args)
    {
        int n,t,a[],i,c=0;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        t=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]<=t)
            {
                c++;
            }
            else
            {
                c=c+2;
            }
        }
        System.out.println(c);
    }
}