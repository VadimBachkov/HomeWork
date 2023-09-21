import java.util.Arrays;
import java.util.Scanner;

public class AdditionalTasks {
    public static void main(String[] args) {
        { //Дополнительное задание 5 "Массивы"
            int [] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
            System.out.println("Введите число:");
            Scanner scanner = new Scanner(System.in);
            int inArr = scanner.nextInt();

            int index = -1;
            for ( int i : array) {
                    if (array[i] == inArr) {
                        index = array[i];
                        break;
                    }
            }
            System.out.println("Число " + inArr + " есть в массиве под индексом " + index);
        }
        {  //Дополнительное задание 6 "Массивы"
            Scanner sc = new Scanner(System.in);
            int N;
            int A;
            int B;

            do {
                System.out.println("Введите размер массива N: ");
                N = sc.nextInt();
            }while (N <= 0);

            do {
                System.out.println("Введите нижнюю граниу массива ");
                A = sc.nextInt();
                System.out.println("Введите верхнюю граниу массива ");
                B = sc.nextInt();
            }while (A >= B);

            int array [] = new int [N];

            for ( int i = 0; i < array.length; i ++){
                array[i] = (int) ((Math.random() * (B-A) + B));
            }
            System.out.println("Массив до инвертации " + Arrays.toString(array));

            for (int i = 0 ; i < array.length / 2 ; i++){
                int temp = array[i];
                array[i] = array[array.length - i - 1];
                array[array.length - i -1] = temp;
            }
            System.out.println("Инвертированный массив " + Arrays.toString(array));
        }
    }
}
