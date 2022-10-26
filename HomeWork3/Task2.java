package HomeWork3;

// Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        System.out.println(arr);
        System.out.println("Только нечётные числа списка -> " + isOdd(arr)); 
    }
    
    public static ArrayList<Integer> isOdd(ArrayList<Integer> args) {
        for(int i = 0; i < args.size(); i++){
            if(args.get(i) % 2 == 0 ){
                args.remove(i);
                i--;
            }
        }
        return args;
    }
}
