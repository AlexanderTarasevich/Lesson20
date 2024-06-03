package Task2;

public class Main {
    public static void main(String[] args) {
        int[] array = {4, 6, 8, 3, 44, 7, 14, 11,74,5,22,44};

        Thread thread1 = new ThreadBubble(array);
        Thread thread2 = new ThreadSelectionSort(array);
        Thread thread3 = new ThreadInsertionSort(array);
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
