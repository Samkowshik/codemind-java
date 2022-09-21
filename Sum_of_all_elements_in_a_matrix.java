import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int m,n,a[][],i,j,s=0,s1=0;
        m=sc.nextInt();
        n=sc.nextInt();
        a=new int[m][n];
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                s=s+a[i][j];
            }
        }
        System.out.println(s);
    }
}