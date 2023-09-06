import java.util.Scanner;

public class Str_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String input = sc.nextLine();

        while (input.isEmpty()){
            System.out.println("Строка пуста, повторите ввод");
            System.out.println("Введите строку");
        }
        System.out.println("Введите симвлол а: ");
        char a = sc.next().charAt(0);
        System.out.println("Введите симвлол b: ");
        char b = sc.next().charAt(0);

        String replacedString = input.replace(a, b);
        System.out.println("Результат: " + replacedString);
    }
}
