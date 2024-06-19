import java.io.*;
import java.net.*;

public class Server {
    public static void main(String args[]) throws IOException {
        ServerSocket serverSocket = new ServerSocket(32000);
        System.out.println("Server started, waiting for a client to connect...");

        Socket socket = serverSocket.accept();
        System.out.println("Client connected...");

        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

        String input = reader.readLine();
        System.out.println("Received from client: " + input);

        String output = new StringBuilder(input).reverse().toString();
        output = invertCase(output);
        System.out.println("Sending to client: " + output);

        writer.println(output);

        socket.close();
        serverSocket.close();
    }

    public static String invertCase(String input) {
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);
    }
}
