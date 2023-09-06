public class SumTwoMax {
    public static void main(String[] args) {
        int a = 4;
        int b = 8;
        int c = 5;

        if ((a >= b && b >= c) || (a <= b && a >= c)) {
            System.out.println(a + b);
        } else if (a >= b && b <= c) {
            System.out.println("Сумма наибольших чисел равна " + (a + c));
        } else {
            System.out.println("Сумма наибольших чисел равна " + (b + c));
        }
    }
}
