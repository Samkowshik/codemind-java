import java.util.Scanner;
class vowelsw
{
	public static void main(String[] args)
	{
		char ch;
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		switch(ch)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
					System.out.println("Vowel");
					break;
			default :
					System.out.println("Consonant");
		}
	}
}