public class Tuba implements Instrument{

    public int d = 400;

    Tuba(int d){
        this.d = d;
    }

    public void play(){
        System.out.println("Играет Туба диаметром, мм " + d);
    }
}
