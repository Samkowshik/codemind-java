import java.util.Scanner;
class k
{
    public static void main(String[] args)
    {
        int n,d,a[],i,c=0;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            d=(int)Math.log10(a[i])+1;
            if(d%2==0)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}