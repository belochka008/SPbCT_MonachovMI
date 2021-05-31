import java.net.*;
public class IPfromDNS {
    public static void main(String[] args){
        InetAddress bsu = null;
        try {
            bsu = InetAddress.getByName("www.sutkt.ru"); }
        catch (UnknownHostException e){ }
        System.out.println(bsu);
    }
}