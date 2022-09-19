import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int l,t,w,h,i;
        l=sc.nextInt();
        t=sc.nextInt();
        for(i=1;i<=t;i++)
        {
            w=sc.nextInt();
            h=sc.nextInt();
            if(w<l||h<l)
            System.out.println("UPLOAD ANOTHER");
            else
            {
                if(w!=h)
                System.out.println("CROP IT");
                else
                System.out.println("ACCEPTED");
            }
        }
    }
}