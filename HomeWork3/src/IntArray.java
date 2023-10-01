import java.util.Arrays;

public class IntArray {
    private int[] array;
    private int length;

    public IntArray() {
        int[] array = new int[10];
    }

    public IntArray(int length) {
        int[] array = new int[length];
        this.length = array.length;
    }

    public IntArray(int... element) {
        array = element;
        length = array.length;
    }

    public void sort(boolean isAsc) {
        if (isAsc) {
            Arrays.sort(array);
        } else
        {
            Arrays.sort(array);
            for (int i = 0; i < array.length / 2; i++) {
                int temp = array[i];
                array[i] = array[array.length - i - 1];
                array[array.length - i - 1] = temp;
            }
        }
    }

    public void PrintArray() {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
