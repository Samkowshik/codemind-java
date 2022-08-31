import java.util.Scanner;
class sam
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int s,t,b,a;
		s=sc.nextInt();
		t=sc.nextInt();
		b=sc.nextInt();
		a=(2*s*t*b*512)/1024;
		System.out.print(a+"KB");
	}
}