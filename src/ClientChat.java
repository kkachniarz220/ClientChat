import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class ClientChat {

    public static void main(String message) throws IOException {
        Socket socket;
        PrintWriter printWriter;

        try {
            socket = new Socket(InetAddress.getLocalHost(), 5000);
            printWriter = new PrintWriter(socket.getOutputStream(), true);
            printWriter.println(message);
        } catch (Throwable th) { }


    }
}
