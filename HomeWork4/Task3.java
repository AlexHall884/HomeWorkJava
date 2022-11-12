package HomeWork4;
// В калькулятор добавьте возможность отменить последнюю операцию.

import java.util.Scanner;
import java.util.Stack;

public class Task3 {

    public static void Calcul(Stack<Integer> st, String choice) {
        int number2 = st.pop();
        int number1 = st.peek();
        
        int result = 0;

        switch (choice) {
            case ("+"):
                result = number1 + number2;
                break;

            case ("-"):
                result = number1 - number2;
                break;

            case ("*"):
                result = number1 * number2;
                break;

            case ("/"):
                result = number1 / number2;
                break;

            default:
                break;
        }
        System.out.println(number1 + " " + choice + " " + number2 + " = " + result);
    }

    public static String UserChoiseOperation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите +, -, * или /");
        System.out.print(": ");
        String choice = sc.next();
        return choice;
    }

    public static void main(String[] args) {
        System.out.println("Здравствуйте, эта программа <Калькулятор>.");
        Stack<Integer> st = new Stack<>();
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            System.out.printf("Введите первое число: ");
            st.push(scan.nextInt());
            System.out.printf("Введите второе число: ");
            st.push(scan.nextInt());
            String choice = UserChoiseOperation();
            Calcul(st, choice);
            System.out.println("Первое число: " + st.peek());
            System.out.println("Хотите отменить операцию?\nВведите 'y'\nВведите 'n' для продолжение\nВведите 'q' для выхода");
            System.out.print(": ");
            choice = scan.next();
            if (choice.equals("y")) {
                System.out.println("Первое число: " + st.peek());
                System.out.printf("Введите второе число: ");
                st.push(scan.nextInt());
                choice = UserChoiseOperation();
                Calcul(st, choice);
            }
            if (choice.equals("n")) {
                continue;
            }
            if (choice.equals("q")) {
                System.out.println("До новых встреч.");
                break;
            }
        }
    }
}
