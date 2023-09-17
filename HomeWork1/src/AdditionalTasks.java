import java.util.Scanner;

public class AdditionalTasks {
    public static void main(String[] args) {
        { //дополнительное задание 5 "Операторы сравнения и логические операторы"
            int a = 10;
            int b = 8;
            System.out.println("Выберете номер операции: 1 '+', 2 '-', 3 '*', 4 '/' ");
            Scanner sc = new Scanner(System.in);
            int operator = sc.nextInt();

            switch (operator) {
                case 1:
                    System.out.println(a + b);
                    break;
                case 2:
                    System.out.println(a - b);
                    break;
                case 3:
                    System.out.println(a * b);
                    break;
                case 4:
                    System.out.println(a / b);
                    break;
            }
        }
        {
            //дополнительное задание 6 "Операторы сравнения и логические операторы"

            int x = 155;
             if (x % 2 == 0){
                 System.out.println("X - четное число");
             }else {
                 System.out.println("X - нечетное число");
             }

             if (x / 10 < 1){
                 System.out.println("Однозначное число");
             }else if (x / 100 < 1){
                 System.out.println("Двухначное число");
             }else {
                 System.out.println("Трехзначное число");
             }
        }
        {
            //дополнительное задание 5 "Циклы"

            int A = 10;
            int B = 5;
            do{
                A -= B;
            }while (A > B);

            System.out.println("Длина незанятой области равна " + A);
        }
    }
}
