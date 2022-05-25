import java.util.Scanner;
class k
{
    public static void main(String[] args)
    {
        int n,a[],i,j,c;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            c=0;
            for(j=0;j<n;j++)
            {
                if(a[j]<a[i])
                {
                    c++;
                }
            }
            
        System.out.print(c+" ");
        }
    }
}