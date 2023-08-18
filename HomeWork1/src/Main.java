// exersize 1

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите имя:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Введите фамилию:");
        String surname = sc.nextLine();

        System.out.println("Введите профессию:");
        String profession = sc.nextLine();

        System.out.println("Введите возраст:");
        int age = sc.nextInt();
        sc.nextLine();

//        Person pr = new Person(name,surname,age,profession);
//        Person p = new Person();

//        System.out.println(pr.getFullName());
        Person.printAgeGroup(age);
        System.out.println(System.currentTimeMillis());
    }
}