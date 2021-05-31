import java.net.*;
public class MyLocal {
    public static void main(String[] args){
        InetAddress myIP = null;
        try {
            myIP = InetAddress.getLocalHost();}
        catch (UnknownHostException e) {}
        System.out.println(myIP);
    }
}