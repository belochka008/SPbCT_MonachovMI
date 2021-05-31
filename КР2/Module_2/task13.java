import java.util.*;
public class Main
{
	public static void main(String[] args) {
	  System.out.println("Введите сначала переменную a после b ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = a+b-(b=a);
        int z = b+a-(a=b);
        System.out.println("Ваши переменные поменялись местами, переменная а = " + c + " переменная b = " + z );
	}
}
