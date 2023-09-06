import java.util.Arrays;
import java.util.Scanner;

public class Ex2_Les2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrLength ;
        int min;
        int max;

        do {
            System.out.println("Введите размер массива: ");
            arrLength = sc.nextInt();
        } while (arrLength <= 0);
        do {
            System.out.println("Введите нижнюю границу диапазона массива: ");
            min = sc.nextInt();
            System.out.println("Введите верхнюю границу диапазона массива: ");
            max = sc.nextInt();
        } while (min> max);

        int [] array = new int[arrLength];
        for (int i = 0; i<array.length; i++){
            array[i] = (int) ((Math.random() * (max-min) + min));
        }
        System.out.println(Arrays.toString(array));
    }
}
