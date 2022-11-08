import java.util.*;
class sam
{
    public int[] ins(int n,int a[],int x,int p)
    {
        int i;
        int b[]=new int[n];
        for(i=0;i<n;i++)
        {
            if(i<p)
            b[i]=a[i];
            else if(i==p)
            b[i]=x;
            else
            b[i]=a[i-1];
        }
        return b;
    }
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		sam s=new sam();
		int n,m,a[],b[],c[],i;
		n=sc.nextInt();
		a=new int[n];
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();
		m=sc.nextInt();
		b=new int[m];
		for(i=0;i<n;i++)
		b[i]=sc.nextInt();
		c=new int[n];
		for(i=0;i<n;i++)
		{
		    c=s.ins(i+1,c,a[i],b[i]);
		}
		for(i=0;i<n;i++)
		{
		    System.out.print(c[i]+" ");
		}
	}
}