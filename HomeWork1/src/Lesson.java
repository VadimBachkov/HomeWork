public class Lesson {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,10};

        int temp = array[array.length-1];

        for (int i = array.length - 1; i>0; i--){
            array[i]=array[i-1];
        }
        array[0]=temp;

        for (int n : array){
            System.out.print(n);
        }
    }
}
