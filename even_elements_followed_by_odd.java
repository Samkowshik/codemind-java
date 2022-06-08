import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,a[],i,e[],o[],ec=0,oc=0;
        n=sc.nextInt();
        a=new int[n];
        e=new int[n];
        o=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]%2==0)
            {
                e[ec]=a[i];
                ec++;
            }
            else
            {
                o[oc]=a[i];
                oc++;
            }
        }
        for(i=0;i<ec;i++)
        {
            System.out.print(e[i]+" ");
        }
        for(i=0;i<oc;i++)
        {
            System.out.print(o[i]+" ");
        }
    }
}