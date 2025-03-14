public class Task3 {
    public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5};
    int positions = 2;
    int[] result = rotateArray(array,positions);
    printArray(result);
    }

    public static int[] rotateArray(int[] array, int positions) {
        int length = array.length;
        if (length == 0) return array;
        positions = positions % length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[(i + positions) % length] = array[i];
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
