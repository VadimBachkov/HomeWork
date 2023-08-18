import java.util.Random;
import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите кол-во строк ");
        int N = sc.nextInt();
        System.out.println("Введите кол-во столбцов ");
        int M = sc.nextInt();

        int [][] matrix = new int[N][M];

        int max = 9;
        int min = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = (int) ((Math.random() * (max-min) + min));
            }
        }

        for (int [] ints : matrix){
            for (int anInt : ints){
                System.out.print(anInt+ " ");
            }
            System.out.println();
        }
    }
}
