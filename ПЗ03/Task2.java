import java.util.Scanner;
public class Main
{
 public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Введите число:");
      int num = input.nextInt();
      input.close();
      switch(num) {
          case 2:
              System.out.println("Неудовлетворительно");
          break;
          case 3:
              System.out.println("Удовлетворительно");
          break;
          case 4:
              System.out.println("Хорошо");
          break;
          case 5:
              System.out.println("Отлично");
          break;
         default:
              System.out.println("Введите оценку от 2 до 5");
      }
	}
}
