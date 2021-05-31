public class Main
{
	public static void main(String[] args) {
	    int y = 13;
        int x = 5;
        int z = x;
        for (int i = x + 1; i <= y; i++) {
            z *= i;
        }
        System.out.println("Результат = " + z);
	}
}
