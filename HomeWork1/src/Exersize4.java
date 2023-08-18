import java.util.Scanner;

public class Exersize4 {

    public static void main(String[] args) {
        System.out.println("Введите номер года:");
        Scanner sc = new Scanner(System.in);
        int yearNumber = sc.nextInt();

        if (yearNumber % 4 != 0){
            System.out.println("В " + yearNumber + " году 365 дней" );
        }else if(yearNumber % 100 != 0) {
            System.out.println("В " + yearNumber + " году 366 дней");
        }else if(yearNumber % 400 != 0) {
            System.out.println("В " + yearNumber + " году 365 дней");
        } else{
                System.out.println("В " + yearNumber + " году 366 дней" );
    }
}
}
