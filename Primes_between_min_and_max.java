import java.util.Scanner;
class sam
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,i,j,a[],f,c=0,max=0,min=99999,x=0,y=0,t;
        n=sc.nextInt();
        a= new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]>max)
            {
                max=a[i];
                x=i;
            }
            if(a[i]<min)
            {
                min=a[i];
                y=i;
            }
        }
        if(y>x)
        {
            t=x;
            x=y;
            y=t;
        }
        for(i=y;i<=x;i++)
        {
            if(a[i]==1||a[i]==0)
            continue;
            f=0;
            for(j=2;j<a[i];j++)
            {
                if(a[i]%j==0)
                {
                    f=1;
                    break;
                }
            }
            if(f==0)
            c++;
        }
        System.out.print(c);
    }
}