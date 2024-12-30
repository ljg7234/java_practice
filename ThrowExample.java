package practice;

public class ThrowExample {
    public static void main(String[] args) {
        try{
            findClass();
        } catch (ClassNotFoundException e){
            System.out.println("예외 처리: " + e.getMessage());
        }
    }


    public static void findClass() throws ClassNotFoundException {
        Class.forName("java.lang.String2");
    }
}
