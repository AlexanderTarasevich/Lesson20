package Task1;

public class ThreadMAX extends Thread {
    private int[] array;

    public ThreadMAX(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        int max = findMax();
        System.out.println("Максимальное значение: " + max);
    }
    private int findMax(){
        int max=array[0];
        for (int value:array){
            if (value>max){
                max=value;
            }
        }
        return max;
    }
}
