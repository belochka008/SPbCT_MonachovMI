import java.util.Random;
class Main {
    private static Random sRandom = new Random();
    private static char[] sAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
    private static int sLength = sAlphabet.length;

    public static char getRandomChar() {
        return sAlphabet[sRandom.nextInt(sLength)];
    }

    public static void main(String[] args) {

        for (int j = 0; j < 7; j++) {
            System.out.print(getRandomChar() + " ");
            System.out.print(getRandomChar() + " ");
            System.out.print(getRandomChar() + " ");
            System.out.print(getRandomChar() + " ");
            System.out.print(getRandomChar() + " ");
            System.out.print(getRandomChar() + " ");
            System.out.print(getRandomChar() + "\n");
        }
    }
}