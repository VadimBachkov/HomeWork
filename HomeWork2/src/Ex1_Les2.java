import java.util.Arrays;
import java.util.Scanner;

public class Ex1_Les2 {
    public static void main(String[] args) {

        int array [] = new int [4];

        for (int i = 0; i < array.length; i++){
            array[i]= (int) ((Math.random()*(99-10))+10);
        }
        System.out.println(Arrays.toString(array));

        boolean flag = true;
        for(int i = 1; i < array.length; i++){
            if(array[i] <= array[i-1]){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Массив явялется сторого возрастающей последовательностью");
        }else {
            System.out.println("Массив не явялется сторого возрастающей последовательностью");
        }
    }
    }

