import java.util.Arrays;
import java.util.SortedMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] inputArray1 = {10000, 11000, 9000, 8000, 7000};
        int[] outputArray1 = new int[4];
        int sum = 0;
        int max = 0;
        int min = inputArray1[0];
        for (int value : inputArray1) {
            sum += value;
            if (value > max) {
                max = value;
            } else if (value < min) {
                min = value;
            }
        }
        int average = sum / inputArray1.length;
        outputArray1[0] = sum;
        outputArray1[1] = max;
        outputArray1[2] = min;
        outputArray1[3] = average;
        System.out.print(Arrays.toString(inputArray1));
        System.out.println();
        System.out.print(Arrays.toString(outputArray1));
        System.out.println();


        System.out.println("Задание 2");
        int[] inputArray2 = {10000, 15000, 20000, 25000, 110000};
        float[] outputArray2 = new float[5];
        for (int i = 0; i < inputArray2.length; i++) {
            outputArray2[i] = (float) (inputArray2[i] * 0.13);
        }
        System.out.print(Arrays.toString(inputArray2));
        System.out.println();
        System.out.print(Arrays.toString(outputArray2));
        System.out.println();


        System.out.println("Задание 3");
        int[] inputArray3 = {3000, 3500, 7000, 6500, 5000};
        boolean[] outputArray3 = new boolean[5];
        for (int i = 0; i < inputArray3.length; i++) {
            outputArray3[i] = inputArray3[i] > 5000;
        }
        System.out.print(Arrays.toString(inputArray3));
        System.out.println();
        System.out.print(Arrays.toString(outputArray3));
        System.out.println();


        System.out.println("Задание 4");
        int[] inputArray4 = {1000, 1500, -2000, 2500, 3000};
        boolean[] outputArray4 = new boolean[1];
        outputArray4[0] = true;
        for (int balance : inputArray4) {
            if (balance <= 0) {
                outputArray4[0] = false;
                break;
            }
        }
        System.out.print(Arrays.toString(inputArray4));
        System.out.println();
        System.out.println(Arrays.toString(outputArray4));
        System.out.println();


        System.out.println("Задание 5");
        int[] inputArray5 = {0, 34444, 0, 1000, -15000};
        int[] outputArray5 = new int[1];
        outputArray5[0] = 0;
        for (int i : inputArray5) {
            if (i > 0) {
                outputArray5[0]++;
            }
        }
        System.out.print("inputArray5: ");
        for (int i = 0; i < inputArray5.length; i++) {
            System.out.print(inputArray5[i] + ", ");
            if (i < inputArray5.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println("outputArray5: " + outputArray5[0]);

    }
}