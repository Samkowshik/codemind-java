import java.util.Scanner;
class sam
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,i,j,a[],e[],o[],x=0,y=0;
        n=sc.nextInt();
        a= new int[n];
        e= new int[n];
        o= new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]%2==0)
            {
                e[x]=a[i];
                x++;
            }
            else
            {
                o[y]=a[i];
                y++;
            }
        }
        for(i=0;i<n;i++)
        {
            if(e[i]!=0)
            System.out.print(e[i]+" ");
            if(o[i]!=0)
            System.out.print(o[i]+" ");
        }
        if(n%2!=0)
        System.out.print(0);
    }
}