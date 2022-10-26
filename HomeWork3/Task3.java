package HomeWork3;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка

import java.util.ArrayList;
import java.util.Comparator;

public class Task3 {
    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(22);
        arr.add(3);
        arr.add(7);
        arr.add(5);
        arr.add(10);
        arr.add(56);
        arr.add(0);
        arr.add(14);

        System.out.println(arr);

        ListInfo(arr);
    }

    public static void ListInfo(ArrayList<Integer> args) {
        System.out.println("Информация о списке: ");
        args.sort(Comparator.naturalOrder());
        System.out.println("Максимальный элемент -> " + args.get(args.size() - 1));
        args.sort(Comparator.reverseOrder());
        System.out.println("Минимальный элемент -> " + args.get(args.size() - 1));

        int sum = 0;
        for(int i = 0; i < args.size(); i++){
            sum+= i;
        }
        System.out.println("Сумма всех элементов -> " + sum);
        int averge = sum / args.size();
        System.out.println("Среднее арифмитическое -> " + averge); 
    }
}
