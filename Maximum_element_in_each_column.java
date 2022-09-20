import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int m,n,a[][],max,x,i,j;
        m=sc.nextInt();
        n=sc.nextInt();
        a= new int[m][n];
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<m;i++)
        {
            max=0;
            for(j=0;j<n;j++)
            {
                x=a[j][i];
                max=x>max?x:max;
            }
            System.out.println(max);
        }
    }
}