import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        String nickname;
        Scanner scanner;
        Socket socket;
        InetSocketAddress inetSocketAddress;

        socket = new Socket();
        inetSocketAddress = new InetSocketAddress(InetAddress.getLocalHost(), 5000);
        socket.connect(inetSocketAddress);

        System.out.print("Type your nickname: ");
        scanner = new Scanner(System.in);
        nickname = scanner.nextLine();

        ClientChat.main(socket,"", nickname);

        if(ClientChat.connectionFailed) {
            System.out.println("Connection error");
        } else {
            System.out.println("Connected");
        }


        while(!ClientChat.connectionFailed) {
            System.out.print("You: ");
            scanner = new Scanner(System.in);
            ClientChat.main(socket, scanner.nextLine(), nickname);
        }
        if(ClientChat.connectionFailed) {
            System.out.println("Connection stopped");
        }
    }
}
