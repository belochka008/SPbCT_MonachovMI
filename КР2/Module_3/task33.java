import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите время часы и минуты");
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int m = scan.nextInt();
        double hm1 =  (360/12)*h + 0.5 * m ;
        double hm2 =  hm1 - 228 ;
        System.out.println("Угол между часовой и минутной стрелкой в этот момент времени равен " + hm2 );
        System.out.println( 30/60);
        }
    }
