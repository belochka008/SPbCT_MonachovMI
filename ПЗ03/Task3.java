import java.util.Scanner;
public class Main
{
 public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Введите число:");
      int num = input.nextInt();
      input.close();
      switch(num) {
          case 0:
              System.out.println("Воскресенье");
          break;
          case 1:
              System.out.println("Понедельник");
          break;
          case 2:
              System.out.println("Вторник");
          break;
          case 3:
              System.out.println("Среда");
          break;
          case 4:
              System.out.println("Четверг");
          break;
          case 5: 
              System.out.println("Пятница");
          break;
          case 6:
              System.out.println("Суббота");
          break;
         default:
              System.out.println("Введите корректный день недели!");
      }
	}
}
222222222
