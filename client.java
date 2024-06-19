import java.io.*;
import java.net.*;

public class Client {
    public static void main(String args[]) throws IOException {
        Socket socket = new Socket("localhost", 32000);
        System.out.println("Connected to the server...");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

        System.out.print("Enter text: ");
        String input = reader.readLine();
        writer.println(input);

        BufferedReader serverResponse = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String response = serverResponse.readLine();
        System.out.println("Response from server: " + response);

        socket.close();
    }
}
