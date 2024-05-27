package Task1;

import java.util.Scanner;

//Пользователь вводит с клавиатуры значение в массив. После чего запускаются два
//потока. Первый поток находит максимум в массиве, второй — минимум. Результаты
//вычислений возвращаются в метод Task1.main().
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] userArray = new int[5];
        System.out.println("Введите пять элементов массива: ");
        for (int i = 0; i < 5; i++) {
            userArray[i] = scanner.nextInt();
        }
        Thread minThread = new ThreadMIN(userArray);
        Thread maxThread = new ThreadMAX(userArray);
        minThread.start();
        maxThread.start();

        try {
            minThread.join();
            maxThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
