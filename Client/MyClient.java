import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
//from  w w  w  . j a  v  a2 s  .c  o  m
public class MyClient {




    public static void main(String[] args) throws Exception {
        private int mcPort = 32012;
        String mcIPStr = "230.1.1.1";
        DatagramSocket udpSocket = new DatagramSocket();

        InetAddress mcIPAddress = InetAddress.getByName(mcIPStr);

        byte[] msg = mcIPAddress.getLocalHost().getHostAddress().getBytes();
        DatagramPacket packet = new DatagramPacket(msg, msg.length);
        packet.setAddress(mcIPAddress);
        packet.setPort(mcPort);
        udpSocket.send(packet);



        System.out.println("Sent a  multicast message.");
        System.out.println("Exiting application");
        udpSocket.close();
    }
}