import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        ticket1();

    } public static void ticket1() {
        int[] nums = {1, 2, 3};
        int[] reversed = reverseArray(nums);
        System.out.println(Arrays.toString(reversed));
    } public static int[] reverseArray(int[] arr) {
        int length = arr.length;
        int[] reversed = new int[length];

        for (int i = 0; i < length; i++) {
            reversed[i] = arr[length - 1 - i];
        }
        return reversed;
    }
}