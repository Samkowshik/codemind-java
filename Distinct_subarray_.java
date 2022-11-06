import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,m,i,j,k,s,c=0;
        n=sc.nextInt();
        m=sc.nextInt();
        for(i=n;i<=m;i++)
        {
            for(j=n;j<=m;j++)
            {
                s=0;
                for(k=i;k<=j;k++)
                {
                    s=s+k;
                }
                if(s%2==1)
                {
                    c++;
                }
            }
        }
        System.out.print(c);
    }
}