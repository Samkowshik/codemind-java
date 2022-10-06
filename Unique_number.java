import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,x,a[],i,j,r,f=0;
        x=sc.nextInt();
        n=(int)Math.log10(x)+1;
        a=new int[n];
        for(i=0;i<n;i++)
        {
            r=x%10;
            a[i]=r;
            x=x/10;
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(a[i]==a[j] && i!=j)
                {
                    f=1;
                    break;
                }
            }
        }
        if(f==0)
        System.out.println("Unique Number");
        else
        System.out.println("Not Unique Number");
    }
}