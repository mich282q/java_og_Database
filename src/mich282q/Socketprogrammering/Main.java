package mich282q.Socketprogrammering;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DataInputStream in;
        DataOutputStream out;
        System.out.println("Serveren er startet!");
        try {
            ServerSocket serverSocket = new ServerSocket(8000);
            Socket socket = serverSocket.accept();


            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());

            System.out.println("Data er modtaget på port 8000 via TCP, så det super");
            out.writeUTF("Hallo du har tilkoblet dig til den helt rigtigt server.");
            String besked = in.readUTF();
            besked = in.readUTF();
            while (true) {

                besked = in.readUTF();
                System.out.println("modtaget besked:" + besked);
                out.writeUTF("jeg hører hvad du siger, klientnissen. du siger:"+besked);

            }
        }catch (IOException ex){
            System.out.println(ex);
        }
        System.out.println("serveren er gået kold");
    }
}
