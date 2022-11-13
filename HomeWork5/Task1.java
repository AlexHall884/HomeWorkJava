package HomeWork5;

/*Реализуйте структуру телефонной книги с помощью HashMap, учитывая, 
что 1 человек может иметь несколько телефонов.*/
import java.util.*;

public class Task1 {
    public static void addContact(Map<ArrayList<String>, ArrayList<Integer>> phoneBook, ArrayList<String> name, ArrayList<Integer> phone){
        phoneBook.put(name,phone);
    }
    

    public static ArrayList<Integer> getPhone (){
        ArrayList Phones = new ArrayList<>(5);
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите номер телефона -> ");
        int phone = scan.nextInt();
        Phones.add(phone);
        System.out.print("Добавить ещё один номер?(Y/N)\n-> ");
        while (true){
            String input = scan.next();
            if (input.equals("n")) break;
            if (input.equals("y")) {
                System.out.print("Введите номер телефона -> ");
                phone = scan.nextInt();
                Phones.add(phone);
                System.out.print("Добавить ещё один номер?(Y/N)\n-> ");
            }
        }
        //scan.close();
        return Phones;
    }

    public static ArrayList<String> getName(){
        Scanner scan = new Scanner(System.in);
        ArrayList Names = new ArrayList<>(2);
        System.out.print("Введите имя контакта -> ");
        String name = scan.nextLine();
        Names.add(name);
        System.out.print("Введите фамилию -> ");
        String surname = scan.nextLine();
        Names.add(surname);
        //scan.close();
        return Names;
    }
public static void Menu() {
    Map<ArrayList<String>, ArrayList<Integer>> phoneBook = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Вас приветсвует программа PhoneBook!");
        System.out.print("Чтобы добавить контакт нажмите '1'\nЧтобы выйти нажмите '2'\nЧтобы посмотреть контакты нажмите '3'\n-> ");
        while (true) {
            String choice = scan.nextLine();
            if(choice.equals("2")){
                System.out.println("До новых встреч.");
                break;
            }
            if(choice.equals("1")){
                addContact(phoneBook, getName(), getPhone());
                System.out.print("Чтобы добавить ещё один контакт нажмите '1'\nЧтобы выйти нажмите '2'\nЧтобы посмотреть контакты нажмите '3'\n-> ");
            }
            if(choice.equals("3")){
                System.out.println("Ваши контакты -> " + phoneBook);
                System.out.print("Чтобы добавить ещё один контакт нажмите '1'\nЧтобы выйти нажмите '2'\nЧтобы посмотреть контакты нажмите '3'\n-> ");
            }
        }
}
    public static void main(String[] args) {
        Menu();

    }
}