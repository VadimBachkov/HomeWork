
public class Main {
    public static void main(String[] args) {

    // Создаем три экземляра класса Phone и выводим в консоль значения их переменных
    Phone phone1 = new Phone();
    phone1.number = 123456789;
    phone1.model = "Iphone 14 pro Max";
    phone1.weight = 270.5;
        System.out.println("Вес: " + phone1.weight +" Номер: "+ phone1.number + " Модель: " + phone1.model);

        Phone phone2 = new Phone();
        phone2.number = 456987845;
        phone2.model = "Iphone 13";
        phone2.weight = 210.5;
        System.out.println("Вес: " + phone2.weight +" Номер: "+ phone2.number + " Модель: " + phone2.model);

        Phone phone3 = new Phone();
        phone3.number = 328569795;
        phone3.model = "Iphone 12";
        phone3.weight = 220.5;
        System.out.println("Вес: " + phone3.weight +" Номер: "+ phone3.number + " Модель: " + phone3.model);

        // Вызываем методы receiveCall и getNumber у каждого из обхектов
        phone1.receiveCall("Nick");
        phone1.getNumber(phone1.number);

        phone2.receiveCall("Sam");
        phone2.getNumber(phone2.number);

        phone3.receiveCall("Dean");
        phone3.getNumber(phone3.number);

        //вызываем перешруженный метод receiveCall
        phone1.receiveCall("Nick", phone1.number);
        phone2.receiveCall("Sam", phone2.number);
        phone3.receiveCall("Dean", phone3.number);

        //вызываем переменной длины sendMessage
        phone1.sendMessage(phone1.number);
        phone2.sendMessage(phone2.number);
        phone3.sendMessage(phone3.number);
        }
    }