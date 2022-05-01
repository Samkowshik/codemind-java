import java.util.Scanner;
class season
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n,f=0;
        n=sc.nextInt();
        if(n==4 || n==5 || n==6)
        {
            System.out.println("Summer");
            f=1;
        }
        else if(n==7 || n==8 || n==9 || n==10 || n==11)
        {
            System.out.println("Rainy");
            f=1;
        }
        else if(n==11 || n==12 || n==1)
        {
            System.out.println("Winter");
            f=1;
        }
        else if(n==2 || n==3 )
        {
            System.out.println("Spring");
            f=1;
        }
        else
        {
            System.out.println("-1");
        }
    }
}