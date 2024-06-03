package Task2;

import java.util.Arrays;

public class ThreadBubble extends Thread {
    private int[] array;

    public ThreadBubble(int[] array) {
        this.array = array;
    }


    @Override
    public void run() {
        bubbleSort(array);
        System.out.println("Массив сортированный пузырьком: " + Arrays.toString(array));

    }

    public void bubbleSort(int[] array) {
        int temp;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;

            for (int i = 0; i < this.array.length - 1; i++) {
                if (this.array[i] > this.array[i + 1]) {
                    temp = this.array[i];
                    this.array[i] = this.array[i + 1];
                    this.array[i + 1] = temp;
                    sorted = false;
                }
            }
        }

    }

}
