import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientChat {
    public static Boolean connectionFailed;

    public static void main(Socket socket, String message, String nickname) throws IOException {
        PrintWriter printWriter;

        try {
            printWriter = new PrintWriter(socket.getOutputStream(), true);
            if(message.length() != 0) {
                printWriter.println(nickname + ": " + message);
            } else {
                printWriter.println(nickname);
            }
            connectionFailed = false;
        } catch (Throwable th) {
            System.out.println(th);
            connectionFailed = true;
        }


    }
}
