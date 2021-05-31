import java.util.*;
public class Main
{
	public static void main(String[] args) {
	  System.out.println("Введите расстояние в километрах и время в минутах ");
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();
        int t = scan.nextInt();
        int r = d / t;
        double c = r * 16.667 ;
        System.out.println("скорость в м/c = " + c );
	}
}
