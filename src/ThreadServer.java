import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ThreadServer {
    public static void main(String[] args) throws IOException {
        final int PORT = 4040;
        ServerSocket serverSocket = new ServerSocket(PORT);

        System.out.println("Server started...");
        System.out.println("Wating for clients...");

        while (true) {
            Socket clientSocket = serverSocket.accept();
            Thread t = new Thread(() -> {
                try (
                        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                        Scanner in = new Scanner(clientSocket.getInputStream())
                ) {
                    while (in.hasNextLine()) {
                        String input = in.nextLine();
                        if (input.equalsIgnoreCase("exit")) {
                            break;
                        }
                        System.out.println("Received from client: " + input);
                        out.println("receive from server: " + input);
                    }
                } catch (IOException e) { }
            });
            t.start();
        }
    }
}