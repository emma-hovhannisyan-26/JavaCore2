package homework2;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int largest = array.length - 3;
        if (largest > 0) {
            System.out.println(array[largest]);
            System.out.println(array[0]);
        }
    }
}