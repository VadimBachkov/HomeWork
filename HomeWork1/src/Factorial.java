public class Factorial {
    public static void main(String[] args) {
        int number = 8;
        int factorial = 1;
        for (int i = 1; i<= number; i++){
            factorial *= i;
        }
        System.out.println("Факториал числа " + number + " равен " + factorial);
    }
}
