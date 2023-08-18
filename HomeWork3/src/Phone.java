public class Phone {
    int number;
    String model;
    double weight;

   // вызываем из контсруктора с двумя параметрами констр. с двумя
   public Phone (int number, String model, double weight){
        this(number,weight);
        this.model = model;
    }
    public Phone (int number, double weight){
        this.number = number;
        this.weight = weight;
    }

    public Phone(){}

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void getNumber(int number){
        System.out.println(number);
    }

    // перегруженный метод recieveCall

    public void receiveCall(String name, int number){
        System.out.println(name +" "+ number);
    }

    // создаем метод sendMessage переменной длины

    public void sendMessage(int... numbers){
        System.out.println("Сообщение на номер: " + number);
    }

}
