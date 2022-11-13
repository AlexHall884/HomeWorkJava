package HomeWork5;

import java.util.*;

/*Пусть дан список сотрудников:
Иван Иванов
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Иван Юрин
Петр Лыков
Павел Чернов
Петр Чернышов
Мария Федорова
Марина Светлова
Мария Савина
Мария Рыкова
Марина Лугова
Анна Владимирова
Иван Мечников
Петр Петин
Иван Ежов

Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
Отсортировать по убыванию популярности Имени. */

public class Task2 {
    public static void ShowSortNames(String[] names) {
        Map<String, Integer> repNames = new HashMap<>();
        int counter = 0;
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names.length; j++) {
                if (names[i].split(" ")[0].equals(names[j].split(" ")[0])) {
                    counter++;
                }
            }
            repNames.putIfAbsent(names[i].split(" ")[0], counter);
            counter = 0;
        }
        repNames.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
                
        //System.out.println(repNames);

    }
    public static void main(String[] args) {
        
        String [] names = new String[]{
            "Иван Иванов",
            "Светлана Петрова",
            "Кристина Белова",
            "Анна Мусина",
            "Анна Крутова",
            "Иван Юрин",
            "Петр Лыков",
            "Павел Чернов",
            "Петр Чернышов",
            "Мария Федорова",
            "Марина Светлова",
            "Мария Савина",
            "Мария Рыкова",
            "Марина Лугова",
            "Анна Владимирова",
            "Иван Мечников",
            "Петр Петин",
            "Иван Ежов",
        };
        //System.out.println(names);
        ShowSortNames(names);

    }
}
