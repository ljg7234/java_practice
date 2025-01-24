package practice;

import java.io.*;
import java.net.Socket;

public class EchoClient {
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("localhost",50001);
            System.out.println("[클라이언트] 연결 성공");

            String sendMessage = "나는 자바가 좋아";
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            dos.writeUTF(sendMessage);
            dos.flush();
            System.out.println("[클라이언트] 데이터 보냄: " + sendMessage);

            DataInputStream dis = new DataInputStream(socket.getInputStream());
            String receiveMessage = dis.readUTF();
            System.out.println("[클라이언트] 데이터 받음: " + receiveMessage);

        } catch (IOException e){

        }
    }
}
