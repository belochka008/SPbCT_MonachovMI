import java.text.SimpleDateFormat;
import java.util.Date; 
public class Main
{
	public static void main(String[] args) {
	 Date currentDate = new Date();
        SimpleDateFormat dayFormat = new SimpleDateFormat("EEEEEEEE");
        String day = dayFormat.format(currentDate);
        System.out.println(day);
        SimpleDateFormat mounthFormat = new SimpleDateFormat("MMMMMMM");
        String mounth = mounthFormat.format(currentDate);
        System.out.println(mounth);
        System.out.println("Misha");
	}
}
