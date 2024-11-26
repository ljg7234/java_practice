package practice;

public class Practice10 {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        x++;
        ++x;
        System.out.println("x: " + x);
        //x: 12

        System.out.println("-------------");
        y--;
        --y;
        System.out.println("y: " + y);
        //y: 8
        System.out.println("-------------");
        z = x++;
        System.out.println("z: " + z);
        System.out.println("x: " + x);
        //z: 12
        //x: 13
        System.out.println("-------------");
        z = ++x;
        System.out.println("z: " + z);
        System.out.println("x: " + x);
        //z: 14
        //x: 14
        System.out.println("-------------");
        z = x++ + ++y;
        System.out.println("z: " + z);
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        //z: 21
        //x: 13
        //y: 9

    }
}
