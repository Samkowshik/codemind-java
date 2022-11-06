import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1,s2;
        int u;
        double s,c,t;
        s1=sc.next();
        sc.nextLine();
        s2=sc.next();
        sc.nextLine();
        u=sc.nextInt();
        if (u<200)
        c=u*1.20;
        else if (u<400)
        c=u*1.50;
        else if (u<600)
        c=u*1.80;
        else
        c=u*2.00;
        if(c>400)
        c=c+c*0.15;
        else
        c=c+100;
        System.out.printf("%.2f",c);
    }
}