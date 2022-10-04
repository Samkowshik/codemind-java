import java.util.Scanner;
class sam
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,i,j,a[],f,c=1;
        n=sc.nextInt();
        for(i=3;i<=n;i++)
        {
            if(n%i==0)
            {
            f=0;
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    f=1;
                    break;
                }
            }
            if(f==1)
            c++;
            }
        }
        System.out.print(c);
    }
}