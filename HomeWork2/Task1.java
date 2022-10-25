package HomeWork2;

/*Реализуйте алгоритм сортировки пузырьком числового массива, 
результат после каждой итерации запишите в лог-файл. */
import java.io.IOException;
import java.util.logging.*;

import java.util.Arrays; // позволит вывести массив целиком

public class Task1 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Task1.class.getName());
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFail = pathProject.concat("/HomeWork2/Task1.log");
            Handler fileHandler = new FileHandler(pathFail, true);
            SimpleFormatter sFormat = new SimpleFormatter();
            fileHandler.setFormatter(sFormat);
            logger.addHandler(fileHandler);
            } catch (SecurityException | IOException e) {
                System.out.print("Error");
            }
        int[] arr = { 15, 4, 6, 1, 5, 0, 11, 9 };
        System.out.println("Наш массив-> "+ Arrays.toString(arr)); 
        BubbleSort(arr, logger);      
    }
    public static void BubbleSort(int args[], Logger logger) {
        
        boolean isSorted = false; // переменная(флаг), которая поможет определить отсортирован ли массив.
        int buffer = 0; // переменная буфер понадобится при обмене (перестановке элементов)
        while (!isSorted) { // пока наш флаг равен False продолжаем цикл(сортируем массив)
            isSorted = true; // меняем флаг на true(потому как незенаем нужно ли его вообще сортировать)
            for (int i = 0; i < args.length - 1; i++) { // добавим цикл for что бы пробежаться по массиву(идём до
                                                        // предпоследнего элемента, так как сравниваем по элементы по
                                                        // парам)
                if (args[i] > args[i + 1]) { // добавим условие если элемент больше следующего
                    isSorted = false; // то меняем флаг на false
                    logger.info("Элемент " + args[i] + " переносим с позиции " + i + " на позицию " + (i +1));
                    buffer = args[i]; // и переставляем элементы местами
                    args[i] = args[i + 1];
                    args[i + 1] = buffer;
                }
            }
        }
        System.out.println("Отсортированный массив -> " + Arrays.toString(args)); // выводим массив в консоль
        logger.info("Массив отсортирован");
    }
}
