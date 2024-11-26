package practice;

public class Practice16 {
    public static void main(String[] args) {
        int score = 40;
        char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : ( (score > 70) ? 'C' : 'D'));
        System.out.println(score + "점은 " + grade + "등급입니다");
    }
}
