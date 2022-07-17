import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        int n,d,i,r,c=0;
        Scanner  sc= new Scanner(System.in);
        n=sc.nextInt();
        d=(int)Math.log10(n)+1;
        while(n!=0)
        {
            r=n%10;
            if(r%2==0)
            c++;
            n=n/10;
        }
        if(c==d)
        System.out.println("Even");
        else if(c==0)
        System.out.println("Odd");
        else
        System.out.println("Mixed");
    }
}