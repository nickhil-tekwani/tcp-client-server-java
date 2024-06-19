# TCP Client-Server in Java 
## CS 6550

A simple TCP client and server written in Java. The 
client sends a string to the server, which in turn, reverses the string 
and changes its case, and sends the modified string back to the client.


### Run the Server
1. Open a terminal window.
2. Navigate to the directory containing the Server.java file.
3. Compile the Java file using the following command: javac Server.java
4. Run the server using the following command: java Server

The server is now listening on port 32000 for incoming connections.

### Run the Client
1. Open a new terminal window.
2. Navigate to the directory containing the Client.java file.
3. Compile the Java file using the following command:
javac Client.java
4. Run the client using the following command:
java Client

The client will connect to the server, prompt you to enter a string, send 
this string to the server, receive the response from the server, and print 
the server's response.

### Notes
The client and server are designed to be run on the same machine 
(localhost), and the server listens on port 32000. If you want to run the 
client and server on different machines, or use a different port, you'll 
need to update the IP addresses and port numbers in both the client and 
server programs.
