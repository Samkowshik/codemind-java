import java.util.Scanner;
class sam
{
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        int m,n,a[][],s=0,i,j;
        m=sc.nextInt();
        n=sc.nextInt();
        a=new int[m][n];
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
                s=s+a[i][j];
            }
        }
        System.out.println(s);
    }
}