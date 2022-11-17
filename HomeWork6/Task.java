/*Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий фильтрации 
и выведет ноутбуки, отвечающие фильтру.
Критерии фильтрации можно хранить в Map.
Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …

Далее нужно запросить минимальные значения для указанных критериев - 
сохранить параметры фильтрации можно также в Map.

Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям. */

import java.util.*;

public class Task {

    public static Integer FilterChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для поиска: ");
        System.out.println(
                "1-> по модели\n2-> по процессору\n3-> по оперативной памяти\n4-> по жесткому диску\n5-> по цвету\n6-> посмотреть все модели\n");
        System.out.print("Ваш выбор: ");
        return scanner.nextInt();
    }

    public static String FirstUpperCase(String word) {
        if (word == null || word.isEmpty())
            return "";
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    public static void FindByFilter(Set<Notebook> products, String filter, String input) {
        Integer count = 1;
        Map<String, Notebook> result = new LinkedHashMap<>();
        for (Notebook comp : products) {
            if (comp.GetInfo(filter).contains(input)) {
                result.put(String.format("\n\nНоутбук № %d", count), comp);
                count++;
            }
        }
        if (result.isEmpty()) {
            System.out.println("Ничего не найдено");
        } else {
            System.out.println("Вот что удалось найти:\n" + result);
        }
    }

    public static void main(String[] args) {

        Notebook comp1 = new Notebook("1010", "HP 250", "Intel Core i5",
                "4 GB", "2T", "Black");
        Notebook comp2 = new Notebook("1101", "ASUS Vivobook Go 14", "Intel Pentium Silver N6000",
                "4 GB", "1T", "Grey");
        Notebook comp3 = new Notebook("1011", "Lenovo IdeaPad 1", "AMD Athlon Silver 3050e",
                "4 GB", "2T", "Black");
        Notebook comp4 = new Notebook("1001", "Lenovo IdeaPad 1", "AMD Athlon Silver 3050e",
                "8 GB", "2T", "White");
        Notebook comp5 = new Notebook("1100", "HP 250", "Intel Core i5",
                "4 GB", "1T", "Grey");
        Notebook comp6 = new Notebook("1111", "HP 250", "Intel Core i5",
                "8 GB", "2T", "White");

        HashSet<Notebook> products = new HashSet<Notebook>(Arrays.asList(comp1, comp2, comp3, comp4, comp5, comp6));

        System.out.println("Мы рады приветсвовать вас, наша программа поможет найти вам нужный ноутбук.");

        Map<Integer, String> filters = new HashMap<>();
        filters.put(1, "model");
        filters.put(2, "processor");
        filters.put(3, "RAM");
        filters.put(4, "HDD");
        filters.put(5, "Color");
        filters.put(6, "All products");
        Integer choice = FilterChoice();

        Scanner scanner = new Scanner(System.in);

        if (filters.containsKey(choice)) {
            switch (choice) {
                case 1: {
                    System.out.println("Введите наименование модели");
                    System.out.print("-> ");
                    String input = FirstUpperCase(scanner.next());
                    FindByFilter(products, filters.get(1), input);
                    break;
                }
                case 2: {
                    System.out.println("Введите наименование процессора");
                    System.out.print("-> ");
                    String input = FirstUpperCase(scanner.next());
                    FindByFilter(products, filters.get(2), input);
                    break;
                }
                case 3: {
                    System.out.println("Введите объём оперативной памяти");
                    System.out.print("-> ");
                    String input = scanner.next();
                    FindByFilter(products, filters.get(3), input);
                    break;
                }
                case 4: {
                    System.out.println("Введите объём жёсткого диска");
                    System.out.print("-> ");
                    String input = scanner.next();
                    FindByFilter(products, filters.get(4), input);
                    break;
                }
                case 5: {
                    System.out.println("Введите цвет");
                    System.out.print("-> ");
                    String input = FirstUpperCase(scanner.next());
                    FindByFilter(products, filters.get(5), input);
                    break;
                }
                case 6: {
                    Integer count = 1;
                    System.out.println("\nНаш ассортимент:");
                    for (Notebook comp : products) {
                        System.out.println("\nНоутбук №" + count + "\n" + comp);
                        count++;
                    }
                    break;
                }
                default:
                    break;
            }
        }
        scanner.close();
    }
}
