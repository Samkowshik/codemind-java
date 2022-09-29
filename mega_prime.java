import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,r,d,i,f=0,c1=0,c=0;
        n=sc.nextInt();
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                f=1;
                break;
            }
        }
        while(n>0)
        {
            r=n%10;
            if(r==2||r==3||r==5||r==7)
            {
                c1++;
            }
            n=n/10;
            c++;
        }
        if(f==0&&(c==c1))
        System.out.print("Mega Prime");
        else
        System.out.print("Not Mega Prime");
    }
}