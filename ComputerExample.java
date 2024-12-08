package practice;

public class ComputerExample {
    public static void main(String[] args) {
        int r = 10;
        Calculator calculator = new Calculator();
        System.out.println("원 면적: " + calculator.areaCircle(r));
        Computer compter = new Computer();
        System.out.println("원 면적: " + compter.areaCircle(r));
    }
}
