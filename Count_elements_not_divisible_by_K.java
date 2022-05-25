import java.util.Scanner;
class k
{
    public static void main(String[] args)
    {
        int n,k,a[],i,c=0;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]%k!=0)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}