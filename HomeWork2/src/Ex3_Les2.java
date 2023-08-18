import java.util.Arrays;
import java.util.Scanner;

public class Ex3_Les2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int N = sc.nextInt();
        System.out.println("Введите минимальное число массива");
        int A = sc.nextInt();
        System.out.println("Введите максимальное число массива");
        int B = sc.nextInt();

        int[] array = new int[N];
        for (int i = 0; i<array.length; i++){
            array[i] = (int) ((Math.random() * (B - A) + B));
        }

        int iMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > iMax) {
                iMax = i;
            }
        }
        System.out.println("Массив " + Arrays.toString(array));
        System.out.println("Индекс максимального элемента " + iMax);
    }
}
