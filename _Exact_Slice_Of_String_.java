import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        String s1;
        int i,m,n;
        Scanner sc= new Scanner(System.in);
        s1=sc.nextLine();
        m=sc.nextInt();
        n=sc.nextInt();
        char ch[]=s1.toCharArray();
        for(i=m;i<=n;i++)
        {
            System.out.print(ch[i]);
        }
        //System.out.println(s);
    }
}