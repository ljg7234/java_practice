package practice;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class DateTimeCompareExample {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");

        LocalDateTime startDateTime = LocalDateTime.of(2021, 1, 1,0,0,0);
        System.out.println("시작일: " + startDateTime.format(dtf));

        LocalDateTime endDateTime = LocalDateTime.of(2021,12,31,0,0,0);
        System.out.println("종료일: " + endDateTime.format(dtf));

        if(startDateTime.isBefore(endDateTime)){
            System.out.println("진행중입니다");
        } else if(startDateTime.isEqual(endDateTime)){
            System.out.println("종료합니다");
        } else if(startDateTime.isAfter(endDateTime)){
            System.out.println("종료했습니다");
        }

        long remainyear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
        System.out.println("남은 해: " + remainyear);
    }
}
