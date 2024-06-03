package Task2;

import java.util.Arrays;


public class ThreadSelectionSort extends Thread {
    private int[] array;

    public ThreadSelectionSort(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        SelectionSort(array);
        System.out.println("Массив отсортированый выбором: " + Arrays.toString(array));
    }

    public void SelectionSort(int[] array) {
        for (int step = 0; step < array.length; step++) {
            int index = min(array, step);

            int tmp = array[step];
            array[step] = array[index];
            array[index] = tmp;
        }
    }

    private int min(int[] array, int start) {
        int minIndex = start;
        int minValue = array[start];
        for (int i = start + 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
