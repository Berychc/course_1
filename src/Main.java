import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        ticket1();
//        ticket2();
//        ticket3();
//        ticket4();
//        ticket5();
//        ticket6();
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
    } public static void ticket2() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Строка является палиндромом.");
        } else {
            System.out.println("Строка не является палиндромом.");
        }
    } public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    } public static void ticket3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String inputString = scanner.nextLine();

        int length = inputString.length();
        int halfLength = length / 2;

        String firstHalf = inputString.substring(0, halfLength);
        String secondHalf = inputString.substring(halfLength);

        System.out.println("Первая половина: " + firstHalf);
        System.out.println("Вторая половина: " + secondHalf);
    } public static void ticket4() {
        String[] array = {"Bmw", "Bmw", "Dodge", "Mustang", "Bmw", "Audi", "Dodge"};
        String mergedString = removeDuplicates(array);
        System.out.println(mergedString.toString());

    } public static String removeDuplicates(String[] array) {
        StringBuilder mergedString = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (!isDuplicate(array, i)) {
                mergedString.append(array[i]);
            }
        }
        return mergedString.toString();
    } public static boolean isDuplicate(String[] array, int currentIndex) {
        for (int i = 0; i < currentIndex; i++) {
            if (array[i].equals(array[currentIndex])) {
                return true;
            }
        }
        return false;
    } public static void ticket5() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = array(numbers);
        for (int num : result) {
            System.out.print(num + " ");
        }
    } public static int[] array(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i]++;
            }
        }
        int[] subset = new int[5];
        int subsetIndex = 0;
        for (int i = 2; i < 7; i++) {
            subset[subsetIndex] = array[i];
            subsetIndex++;
        }
        return subset;
    } public static void ticket6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        int result = square(number);
        System.out.println("Квадрат числа " + number + " = " + result);
    }
    public static int square(int num) {
        return num * num;
    }
}