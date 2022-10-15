package HomeWork1;
// 3. Реализовать простой калькулятор
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {

        System.out.println("Здравствуйте, эта программа <Калькулятор>.");
        Scanner cs = new Scanner(System.in);
        System.out.print("Введите 1 число: ");
        int number1 = cs.nextInt();
        System.out.print("Введите 2 число: ");
        int number2 = cs.nextInt();
        System.out.println("Что вы найти? Введите +, -, * или / ");
        System.out.print(": ");
        String choice = cs.next();
        cs.close();;

        int result = 0;
        switch (choice) {
            case ("+"):
                result = number1 + number2;
                break;

            case ("-"):
                result = number1 + number2;
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
}
