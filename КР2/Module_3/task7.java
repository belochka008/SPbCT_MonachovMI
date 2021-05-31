import java.util.*;
public class Main
{
	public static void main(String[] args) {
    System.out.println("Введите число");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        if (i >= -10 && i <= 10) {
            i = i + 5;
            System.out.println("Ваше число " + i); }
        else {
            i = i -10;
            System.out.println("Ваше число " + i);}

	}
}
