package Task1;

public class ThreadMIN extends Thread {
    private int[] array;

    public ThreadMIN(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        int min = findMin();
        System.out.println("Минимальное значение: " + min);
    }

    private int findMin() {
        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}
