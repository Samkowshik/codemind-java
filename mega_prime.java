import java.util.Scanner;
class sam
{
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,i,x,f=0,c=0,r;
        n=sc.nextInt();
        x=(int)Math.log10(n)+1;
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                f=1;
                break;
            }
        }
        if(f==0)
        {
            while(n!=0)
            {
                r=n%10;
                if(r==2||r==3||r==5||r==7)
                c++;
                n=n/10;
            }
            if(c==x)
            System.out.println("Mega Prime");
            else
            System.out.println("Not Mega Prime");
        }
        else
        System.out.println("Not Mega Prime");
    }
}