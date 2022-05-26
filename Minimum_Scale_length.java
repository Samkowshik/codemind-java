import java.util.Scanner;
class min
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i,a[],o,c;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(o=a[0];o>0;o--)
        {
            c=0;
            for(i=0;i<n;i++)
            {
                if(a[i]%o==0)
                c++;
            }
            if(c==n)
            {
                System.out.print(o);
                break;
            }
        }
    }
}