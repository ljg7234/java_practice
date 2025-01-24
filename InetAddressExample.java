package practice;

import java.net.InetAddress;
import java.net.UnknownHostException;
public class InetAddressExample {
    public static void main(String[] args) {
        try{
            InetAddress local = InetAddress.getLocalHost();
            System.out.println("내 컴퓨터 ip주소: " + local.getHostAddress());
            InetAddress[] isArr = InetAddress.getAllByName("www.naver.com");
            for(InetAddress remote: isArr){
                System.out.println("www.naver.com ip주소: " + remote);
            }
        } catch (UnknownHostException e){
            e.printStackTrace();
        }
    }
}
