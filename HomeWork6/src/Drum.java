public class Drum implements Instrument{

    public int size = 838;

    public Drum(int size) {
        size = size;
    }

    @Override
    public void play() {
        System.out.println("Играет Барабан высотой, мм " + size );
    }
}
