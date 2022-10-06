import java.util.Scanner;
class sam
{
    public static int fib(int n)
    {
        int s=0,s1=0,s2=1;
        while(s<n)
        {
            s=s1+s2;
            s1=s2;
            s2=s;
        }
        if(n==s)
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
        while(fi==0 && fj==0)
        {
            i++;
            if(fib(i)==1)
            fi=1;
            j--;
            if(fib(j)==1)
            fj=1;
        }
        if(fi==1 && fj==1)
        System.out.print(j+" "+i);
        else if(fj==1)
        System.out.print(j);
        else
        System.out.print(i);
    }
}