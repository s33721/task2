public class Task2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 2, 3};
        int result = findDominant(array);
        System.out.println(result);

    }


    public static int findDominant(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int candidate = array[0];
        int count = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == candidate) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                candidate = array[i];
                count = 1;
            }
        }
        count = 0;
        for (int num : array) {
            if (num == candidate) {
                count++;
            }
        }
        return (count > array.length / 2) ? candidate : -1;
    }


}



