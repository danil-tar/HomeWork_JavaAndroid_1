import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("Me name is Tarasevici Daniil!");

        // Work wish Array

        int[] ints = initArray();
        int sumArray= getSumArray(ints);

        System.out.println("All numbers of Array: ");
        printAllNumberArray(ints);
        System.out.println("\nSumm of all numbers: " + sumArray);
        System.out.println("Average of all numbers: " + (double) sumArray / ints.length);

       // Work wish List

        List<Integer> list = initList();
        System.out.println("All numbers of List: ");

        printNumberList(list);

        int sumList = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("\nSumm of all numbers List: " + sumList);
        System.out.println("Average of all numbers List: " + (double) sumList / list.size());

    }

    private static void printNumberList(List<Integer> list) {
        for (Integer number : list) {
            System.out.print(number + " ");
        }
    }

    private static int getSumArray(int[] ints) {
        int summ = 0;
        for (int number : ints) {
            summ += number;
        }
        return summ;
    }

    private static void printAllNumberArray(int[] ints) {
        for (int number : ints) {
            System.out.print(number + " ");
        }
    }

    private static int[] initArray() {
        int[] ints = new int[10];
        for (int i = 0; i < ints.length; i++)
            ints[i] = (int) (Math.random() * 100);
        return ints;
    }

    private static List<Integer> initList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            list.add((int) (Math.random() * 100));
        return list;
    }
}