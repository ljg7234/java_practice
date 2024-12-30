package practice;
import java.util.TimeZone;
public class PrimeTimeExample {
    public static void main(String[] args) {
        String[] availableIDs = TimeZone.getAvailableIDs();
        for(String id : availableIDs){
            System.out.println(id);
        }
    }
}
