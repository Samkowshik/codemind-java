import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        String s1;
        int i,s=0;
        Scanner sc= new Scanner(System.in);
        s1=sc.nextLine();
        char ch[]=s1.toCharArray();
        for(i=0;i<s1.length();i++)
        {
            if(Character.isDigit(ch[i]))
            {
                s=s+Character.getNumericValue(ch[i]);
            }
        }
        System.out.println(s);
    }
}