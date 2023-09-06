public class IfSwitch {

    public static void main(String[] args) {

        int day = 4;

        if (day == 1){
            System.out.println("День недели пондельник");
        }else if (day == 2){
            System.out.println("День недели вторник");
        }else if (day == 3) {
            System.out.println("День недели среда");
        }else if (day == 4) {
            System.out.println("День недели четверг");
        }else if (day == 5) {
            System.out.println("День недели пятница");
        }else if (day == 6) {
            System.out.println("День недели суббота");
        }else if (day == 7) {
            System.out.println("День недели воскресенье");
        }

        //second solution

        switch (day){
            case 1:
                System.out.println("День недели понедельник");
                break;
            case 2:
                System.out.println("День недели вторник");
                break;
            case 3:
                System.out.println("День недели среда");
                break;
            case 4:
                System.out.println("День недели четверг");
                break;
            case 5:
                System.out.println("День недели пятница");
                break;
            case 6:
                System.out.println("День недели суббота");
                break;
            case 7:
                System.out.println("День недели воскресенье");
                break;
        }
    }
}
