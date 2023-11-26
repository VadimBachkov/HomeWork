import com.company.vehicles.Car;
import com.company.vehicles.Lorry;

public class Main {
    public static void CarDrive() {
        Car[] cars = new Car[1];
        cars[0] = new Car("Бачков Вадим Николаевич", "BMW", 'X', 2000, 2, 280, 2);
        cars[1] = new Lorry("Иванов И.И.", "МАЗ", 'D', 10000, 10, 20, 1000);
    }
    for (Car car : cars) {
        car.toString();
        car.start();
        car.turnRight();
        car.turnLeft();
        car.stop();
    }
}

    public static void main(String[] args) {
        CarDrive();
    }
}
