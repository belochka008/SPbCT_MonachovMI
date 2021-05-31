import java.io.*;
import java.net.*;
public class Server {
    public static void main(String args[]) {
        Socket s = null;
        try {//посылка строки клиенту
            ServerSocket server = new ServerSocket(3456);
            s = server.accept();
            PrintStream ps = new PrintStream(s.getOutputStream());
            ps.println("привет!");
            ps.flush();
            s.close(); // разрыв соединения
        }catch (IOException e){System.out.println("ошибка: " + e); }
    }
}