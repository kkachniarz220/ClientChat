import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner;

        while(true) {
            scanner = new Scanner(System.in);
            ClientChat.main(scanner.nextLine());
        }
    }
}
