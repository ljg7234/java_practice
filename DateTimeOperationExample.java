package practice;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DateTimeOperationExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
        System.out.println("현재 시간: " + now.format(dtf));
        LocalDateTime result1 = now.plusYears(1);
        System.out.println("1년 덧셈: " + result1.format(dtf));
        LocalDateTime result2 = now.minusMonths(13);
        System.out.println("2월 뺄셈: " + result2.format(dtf));

    }
}
