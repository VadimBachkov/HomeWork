import java.util.Arrays;
import java.util.Scanner;

public class Ex4_Les2 {
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

        System.out.println("Массив " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length - i - 1; j++){
                if (array[j] > array[j+1]){
                    int t  = array[j];
                    array[j] = array[j+1];
                    array[j+1] = t;
                }
            }
        }

        System.out.println("Отсортированный массив " + Arrays.toString(array));

    }
}
