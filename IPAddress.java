import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Java program to find IP address and hostname of a machine. 
 *  InetAddress of java.net package is used to get 
 *  IP address and hostname in Java applications.
 *
 * @author WINDOWS 8
 *
 */
public class IPAddress {

    public static void main(String args[]) {

        // First get InetAddress for the machine, here localhost
        InetAddress myIP = null;
        try {
            myIP = InetAddress.getLocalHost();

        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // getHostAddress() returns IP address of a machine
        String IPAddress = myIP.getHostAddress();

        // getHostname returns DNS hostname of a machine
        String hostname = myIP.getHostName();

        System.out.printf("IP address of Localhost is %s %n", IPAddress);
        System.out.printf("Host name of your machine is %s %n", hostname);

    }

}