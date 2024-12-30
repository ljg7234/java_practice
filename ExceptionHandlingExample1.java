package practice;

public class ExceptionHandlingExample1 {
    public static void main(String[] args) {
        String[] array = {"100","1oo",null,"200"};

        for(int i = 0; i <= array.length; i++){
            try{
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]: " + value);
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("배열 인덱스가 초과됨: " + e.getMessage());
            } catch (NumberFormatException | NullPointerException e){
                System.out.println("데이터에 문제 있음: " + e.getMessage());
            }
        }
    }
}
