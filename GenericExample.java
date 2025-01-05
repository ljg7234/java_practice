package practice;

public class GenericExample {
    public static void main(String[] args) {
        Course.registerCourse1(new Applicant<Person>(new Person()));
        Course.registerCourse2(new Applicant<Student>(new Student()));
    }

}
