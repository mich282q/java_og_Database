package mich282q.Socketprogrammering;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try{
            System.out.println("Tilkobler sig nu til serveren");
            Socket socket = new Socket("127.0.0.1",8000);
            System.out.println("er tilsluttet serveren");
            DataOutputStream tilServer = new DataOutputStream(socket.getOutputStream());
            DataInputStream fraServer = new DataInputStream(socket.getInputStream());
            tilServer.writeUTF(" her er jeg, klientnissen pøllemand");

            while (true){
                System.out.println("Skriv en besked:");
                Scanner scanner = new Scanner(System.in);
                String beskedTilservernissen ="";
                beskedTilservernissen = scanner.nextLine();
                tilServer.writeUTF(beskedTilservernissen);
                System.out.println(fraServer.readUTF());
    }}
    catch (IOException e){
        System.out.println("fejl kunne ikke tilsluttet \n" +e);
    }
    }

}
