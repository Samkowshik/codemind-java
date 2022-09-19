import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n1,n2,k,i,c=0;
        n1=sc.nextInt();
        n2=sc.nextInt();
        k=sc.nextInt();
        for(i=n1;i<=n2;i++)
        {
            if(i%k==0)
            c++;
        }
        System.out.print(c);
    }
}