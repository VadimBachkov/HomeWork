public class CountBetween {
    public static void main(String[] args) {
        int A = 5;
        int B = 8;
        int N = 0;

        for (int i = B - 1; i > A; i--) {
            System.out.println(i);
            N++;
        }
        System.out.println("Количество чисел между A и B равно " + N);
    }
}
