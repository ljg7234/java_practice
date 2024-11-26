package practice;

public class Practice17 {
    public static void main(String[] args) {
        int score = (int)(Math.random() * 20) + 81;
        System.out.println("점수 :" + score);

        String grade;

        if (score >= 90) {
            if(score >= 95){
                grade = "A";
            } else {
                grade = "B";
            }
        } else {
            if(score > 85){
                grade = "C";
            } else {
                grade = "D";
            }
        }

        System.out.println("학점 :" + grade);
    }

}
