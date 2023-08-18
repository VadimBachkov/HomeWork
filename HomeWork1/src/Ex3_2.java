import java.util.Arrays;
import java.util.Scanner;

public class Ex3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int arrLength = sc.nextInt();
        System.out.println("Введите минимальное число массива");
        int min = sc.nextInt();
        System.out.println("Введите максимальное число массива");
        int max = sc.nextInt();

        int [] array = new int[arrLength];
        for (int i = 0; i<array.length; i++){
            array[i] = (int) ((Math.random() * (max-min) + min));
        }
        if(arrLength < 0){
            System.out.println("Введите длину массива заново");
            arrLength = sc.nextInt();
        }else if (min > max){
            System.out.println("Введите миниально и максимальное значение заново");
            min =sc.nextInt();
            max = sc.nextInt();
            System.out.println(Arrays.toString(array));
        }else {
            System.out.println(Arrays.toString(array));
        }
    }
}
