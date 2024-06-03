package Task2;

import java.util.Arrays;

public class ThreadInsertionSort extends Thread{
    private int[] array;

    public ThreadInsertionSort(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        insertionSort(array);
        System.out.println("Массив отсортированый вставками: "+ Arrays.toString(array));
    }

    public static void insertionSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            int current=array[i];
            int j=i;
            while (j>0&&array[j-1]>current){
                array[j]=array[j-1];
                j--;
            }
            array[j]=current;
        }
    }
}
