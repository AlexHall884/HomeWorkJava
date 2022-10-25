package HomeWork2;

import java.util.Scanner;

/*Напишите метод, который принимает на вход строку (String) 
и определяет является ли строка палиндромом (возвращает boolean значение). */

public class Task3 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String text = cs.nextLine();
        cs.close();

        System.out.println(Palindrom(text));

    }    
    public static boolean Palindrom(String text) {
        return text.equalsIgnoreCase(new StringBuffer(text).reverse().toString());
    }
}
