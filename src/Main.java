import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        RecurseMass(array, 0);
    }

    public static void RecurseMass(int[] array, int start) {
        if (start == array.length - 1) {
            System.out.print(array[start]);
        } else {
            System.out.print(array[start] + ",");
            start++;
            RecurseMass(array, start);
        }


        OwnList list = new OwnList();
        Random random  = new Random();
        for (int i=0;i<=20;i++){
            list.add(random.nextInt(50));
        }
    }
}
