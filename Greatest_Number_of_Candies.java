import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,a[],k,i,j,x,c;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        k=sc.nextInt();
        for(i=0;i<n;i++)
        {
            c=0;
            x=a[i]+k;
            for(j=0;j<n;j++)
            {
                if(i==j)
                continue;
                if(x>=a[j])
                c++;
            }
            if(c==n-1)
            System.out.print("True ");
            else
            System.out.print("False ");
        }
    }
}