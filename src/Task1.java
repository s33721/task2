import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = filterEvenIndexOddValue(arr);
        printArray(result);

    }

    public static int[] filterEvenIndexOddValue(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && array[i] % 2 != 0) {
                list.add(array[i]);
            }
        }
        int[] result = new int[list.size()];
        for (int j = 0; j < result.length; j++) {
            result[j] = list.get(j);
        }
        return result;
    }
    public static int[] printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        return array;
    }
}
