package practice;

public class GetResourceExample {
    public static void main(String[] args) {
        Class clazz = Car.class;
        String photoPath = clazz.getResource("roadmap.png").getPath();
        System.out.println(photoPath);
    }
}
