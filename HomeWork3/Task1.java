package HomeWork3;

import java.util.Arrays;

// Реализовать алгоритм сортировки слиянием
public class Task1 {
    public static void main(String[] args) {
        int[] array = {15,23,0,9,2,14,8,79,11,54,1};
        System.out.println("Исходный массив -> " + Arrays.toString(array));
        int[] result = MergeSort(array);
        System.out.println("Отсортированный массив -> " + Arrays.toString(result));
    }

    public static int[] MergeSort(int [] args) {
        int[] temp; // переменная для перестановки
        int[] currentArray = args; // исходный массив(точнее его копия)
        int[] bufferArray = new int[args.length]; // должен быть равен длинне исходного массива

        int size = 1; // размер подмассива, который мы хотим сливать
        while (size < args.length) {
            for (int i = 0; i < args.length; i += 2 * size) { // перескакиваем через пары массивов
                merge(currentArray, i, currentArray, i + size, bufferArray, i, size); // сливаем пары массивов
            }

            temp = currentArray;
            currentArray = bufferArray;
            bufferArray = temp;

            size = size * 2;

            //System.out.println(Arrays.toString(currentArray));
        }
        return currentArray;
    }

    private static void merge(int[] arr1, int arr1Start, int[] arr2, int arr2Start, int[] buffer,
                              int bufferStart, int size) {
        int index1 = arr1Start; 
        int index2 = arr2Start;

        int arr1End = Math.min(arr1Start + size, arr1.length); // конец первого подмассива с учётом размера с учётом границ массива в котором он содержится
        int arr2End = Math.min(arr2Start + size, arr2.length); // конец второго подмассива

        if (arr1Start + size > arr1.length) {
            for (int i = arr1Start; i < arr1End; i++) {
                buffer[i] = arr1[i];
            }
            return;
        }
        int iterationCount = arr1End - arr1Start + arr2End - arr2Start; // суммарное количество элементов в обоих подмассивах

        for (int i = bufferStart; i < bufferStart + iterationCount; i++) {
            if (index1 < arr1End && (index2 >= arr2End || arr1[index1] < arr2[index2])) {
                buffer[i] = arr1[index1];
                index1++;
            } else {
                buffer[i] = arr2[index2];
                index2++;
            }
        }
    }
}
