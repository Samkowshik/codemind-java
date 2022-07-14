import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        int t,c,j,i,f;
        Scanner sc= new Scanner(System.in);
        t=sc.nextInt();
        sc.nextLine();
        for(j=0;j<t;j++)
        {
            c=0;
            f=0;
            String s1;
            s1=sc.nextLine();
            char ch[]=s1.toCharArray();
            for(i=0;i<s1.length();i++)
            {
                if(Character.isDigit(ch[i]))
                {
                    c++;
                }
            }
            if(c==s1.length())
            System.out.println("True");
            else
            System.out.println("False");
        }
    }
}