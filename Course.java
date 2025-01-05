package practice;

public class Course {
    public static void registerCourse1(Applicant<?> applicant){
        System.out.println(applicant.getClass().getSimpleName() + "이가 Course1을 등록함");
    }

    public static void registerCourse2(Applicant<? extends Student> applicant){
        System.out.println(applicant.getClass().getSimpleName() + "이가 Course2를 등록함");
    }

    public static void registerCourse3(Applicant<? super Worker> applicant){
        System.out.println(applicant.getClass().getSimpleName() + "이가 Course3을 등록함");
    }
}
