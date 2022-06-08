import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,i,a[],m=99999,c;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            m=a[i]<m?a[i]:m;
        }
        for(;m>0;m--)
        {
            c=0;
            for(i=0;i<n;i++)
            {
                if(a[i]%m==0)
                c++;
            }
            if(c==n)
            {
                System.out.print(m);
                break;
            }
        }
    }
}