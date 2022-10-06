import java.util.Scanner;
class sam
{
    public static int fib(int n)
    {
        int p=1;
        while(p<n)
        {
            p=p*2;
        }
        if(n==p)
        return 1;
        else
        return 0;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,i,j,fi=0,fj=0;
        n=sc.nextInt();
        i=n;
        j=n;
        if(fib(n)==1)
        System.out.print(0);
        else
        {
        while(fi==0 && fj==0)
        {
            i++;
            if(fib(i)==1)
            fi=1;
            j--;
            if(fib(j)==1)
            fj=1;
        }
        if(fj==1)
        System.out.print(n-j);
        else
        System.out.print(i-n);
        }
    }
}