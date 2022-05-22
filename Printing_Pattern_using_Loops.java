import java.util.Scanner;
class headache
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int i,j,x,l,n;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
    {
        x=n;
        for(j=1;j<=n;j++)
        {
            System.out.print(x+" ");
            if(j<i)
            {
                x--;
            }
        }
        for(j=j-2;j>0;j--)
        {
            if(j<i)
            {
                x++;
            }
            System.out.print(x+" ");
        }
        System.out.println();
    }
    for(i=i-2;i>0;i--)
    {
        x=n;
        for(j=1;j<=n;j++)
        {
            System.out.print(x+" ");
            if(j<i)
            {
                x--;
            }
        }
        for(j=j-2;j>0;j--)
        {
            if(j<i)
            {
                x++;
            }
            System.out.print(x+" ");
        }
        System.out.println();
    }
    }
}