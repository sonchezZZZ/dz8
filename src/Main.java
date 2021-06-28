import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        RecurseMass(array, 0);

        OwnList list = new OwnList();
        for (int i = 0; i <= 20; i++) {
            list.add(i);
        }
        System.out.println();


    }

    public static void RecurseMass(int[] array, int start) {
        if (start == array.length - 1) {
            System.out.print(array[start]);
            return;
        } else {
            System.out.print(array[start] + ",");
            start++;
            RecurseMass(array, start);
        }
    }


}
