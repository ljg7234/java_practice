package practice;

public class Computer extends Calculator{
    @Override
    public double areaCircle(double r) {
        System.out.println("computer 객체의 areaCircle() 실행");
        return Math.PI * r * r;
    }
}
