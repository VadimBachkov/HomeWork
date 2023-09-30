import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Практика алгоритмов массивов
        { // Поиск максимального элемента массива
            int [] array = {0,1,2,3,4,5,5,6,65,8,89,45,4,5};
            int iMax = 0;

            for (int i = 0; i < array.length; i++){
                if(array[i] > array[iMax]){
                    iMax = i;
                }
            }
            System.out.println("Индекс максимаьного элемент масива - " + iMax + ", значение " + array[iMax]);
        }

        { // Добавление элемента в массив

            int [] array = {0,2,3};
            int k = 1;

            for (int i = array.length - 1; i > k; i--){
                array[i] = array[i-1];
            }
            array[k]=1;
            System.out.println(Arrays.toString(array));
        }

        { // Удаление элемента массива

            int [] array = {0,2,2,5,74,7,85,4,48,48};
            int k = 2;

            for (int i = 0; i < array.length - 1; i++){
                array[i] = array[i + 1];
            }
            array[k] = 3;
            System.out.println(Arrays.toString(array));


        }

        { // Сортировка пузырьком
            int [] array = {0,2,99,5,74,7,85,4,17,21};

            for (int i = 0; i < array.length; i++){
                for (int j = 0; j < array.length - i -1; j++){
                    if(array[j] > array[j+1]){
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
            }
            System.out.println("Отсортированный массив: " + Arrays.toString(array));
        }
    }
}