import java.util.Scanner;

public class CharInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = sc.nextLine();
        System.out.println("Введите символ: ");

        char chr = sc.nextLine().toCharArray()[0];
        char[] chrArray = str.toCharArray();
        int chrCount = 0;

        for (char i : chrArray) {
            if (i == chr) {
                chrCount++;
            }
        }
        System.out.println("Количество символов " + chr + " в строке " + str + " равно " + chrCount);
    }
}
