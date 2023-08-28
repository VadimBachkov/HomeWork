public class Guitar implements Instrument {

    public int countString = 6;

    Guitar (int countString){
        this.countString = countString;
    }

    public void play(){
        System.out.println("Играет инструмент Guitar, с кол-вом струн - " + countString);
    };
}
