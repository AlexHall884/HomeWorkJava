package HomeWork1;
import java.util.Scanner;
/*1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
    n! (произведение чисел от 1 до n)
*/
public class Task1 {

    public static void main(String[] args) {
        
        System.out.println("Здравствуйте, эта программа вычеслит n-ое треугольного числа или факториал.");
        Scanner cs = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = cs.nextInt();
        System.out.println("Что вы хотите найти? ");
        System.out.println("Если n-ое треугольного числа нажмите 1, если факториал нажмите 2: ");
        int choice = cs.nextInt();
        cs.close();;
        
        if (choice == 1){
            int result = 0;
            for (int i = 1; i <= n; i++){
                result += i;
            }
            System.out.println(result);
        }
        if (choice == 2){
            int result = 1;
            for (int i = 1; i <= n; i++){
                result *= i;
            }
            System.out.println(result);
        }
    }
}