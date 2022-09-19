import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a,b,i,l;
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=1;;i++)
        {
            l=b*i;
            if(l%a==0)
            {
                System.out.print(l);
                break;
            }
        }
    }
}