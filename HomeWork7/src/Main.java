import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
       StringBuilder();
       Pattern();
       Pattern1();
       Pattern2();
       Pattern3();
       Exception();
    }

    //Задание 1
    public static void StringBuilder() {
        int x = 3;
        int y = 56;
        StringBuilder stb = new StringBuilder();
        stb.append(x + " + " + y + " = " + (x + y) + "\n");
        stb.append(x + "-" + y + " = " + (x - y) + "\n");
        stb.append(x + "*" + y + " = " + (x * y) + "\n");

        System.out.println(stb.toString());

        while (stb.indexOf("=") != -1) {
            int i = stb.indexOf("=");
            stb.replace(i, i + 1, "равно");
        }
        System.out.println(stb.toString());
    }

    //Задание 2
    public static void Pattern() {
        System.out.println("Введите ссылку: ");
        Scanner sc = new Scanner(System.in);
        String link = sc.nextLine();

        Pattern pattern = Pattern.compile("^(.*\\.com)$");
        Matcher matcher = pattern.matcher(link);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    //Задание 3
    public static void Pattern1() {

        String str = "ahb acb aeb aeeb adcb axeb";

        Pattern pattern1 = Pattern.compile("a.b");
        Matcher matcher1 = pattern1.matcher(str);

        while (matcher1.find()) {
            System.out.println(matcher1.group());
        }
    }

    //Задание 4
    public static void Pattern2() {
        String str1 = "ab abab abab abababab abea";

        Pattern pattern2 = Pattern.compile("\\b(ab)+\\b");
        Matcher matcher2 = pattern2.matcher(str1);

        while (matcher2.find()) {
            System.out.println(matcher2.group());
        }
    }

    //Задание 5

    public static void Pattern3() {
        System.out.println("Введите дату в формате \"2012/09/18 12:10\" : ");
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();

        Pattern pattern3 = Pattern.compile("^\\d{4}/\\d{2}/\\d{2} \\d{2}:\\d{2}$");
        Matcher matcher3 = pattern3.matcher(date);

        if(matcher3.find()){
            System.out.println("Дата " + date + " существует");
        }else {
            System.out.println("Дата " + date + " не существует");
        }
    }

    public static void Exception(){
        try{
            System.out.println("Введите ФИО: ");
            Scanner scanner = new Scanner(System.in);
            String fio = scanner.nextLine();
            System.out.println("Введите возраст");
            int age = scanner.nextInt();
            scanner.nextLine();

            if (age > 100 || age < 0){
                throw new IncorrectInfoException("Возраст введен некорректно",fio,age);
            }

            Pattern regex = Pattern.compile("\\p{Punct}");
            Matcher matcher = regex.matcher(fio);

            if (matcher.find() || fio.length() > 200){
                throw new IncorrectInfoException("Данные введены некорректно",fio, age);
            }
        }
        catch (IncorrectInfoException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}

