package HomeWork2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import java.io.File;

/*Дана json строка (сохранить в файл и читать из файла) 
(ЕСЛИ НЕ ПОЛУЧАЕТСЯ JSON, то сделайте получение через обычный текстовый файл!!!) 
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
{"фамилия":"Петрова", "оценка":"4","предмет":"Информатика"},
{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}] */
public class Task2 {
    public static void main(String[] args) {
        
        Dictionary <String, String> students1 = new Hashtable<>();
        students1.put("Фамилия", "Иванов");
        students1.put("Предмет", "Математика");
        students1.put("Оценка", "5");

        Dictionary <String, String> students2 = new Hashtable<>();
        students2.put("Фамилия", "Петрова");
        students2.put("Оценка", "4");
        students2.put("Предмет", "Информатика");

        Dictionary <String, String> students3 = new Hashtable<>();
        students3.put("Фамилия", "Краснов");
        students3.put("Оценка", "5");
        students3.put("Предмет", "Физика");

        List <Dictionary <String, String>> studentsList = new ArrayList<>();
        studentsList.add(students1);
        studentsList.add(students2);
        studentsList.add(students3);
        
        
        CreateWriter(studentsList);
        Reader(studentsList);
        
        StringBuilder sb = new StringBuilder();
        for (Dictionary<String, String> student: studentsList) {
            sb.append("Студент ").append(student.get("Фамилия")).append(" получил ").append(student.get("Оценка"))
            .append(" по предмету ").append(student.get("Предмет")).append("\n");
        }
        
        System.out.println(sb);
    }
    
    public static void CreateWriter(List<Dictionary<String, String>> args){
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/HomeWork2/Task2.txt");
            FileWriter fw = new FileWriter(pathFile, StandardCharsets.UTF_8);
            fw.write(args.toString());
            fw.close();
            File file = new File(pathFile);
            if (file.createNewFile()) {
                System.out.println("Создан новый файл");
            } else {
                System.out.println("Такой файл уже существует");
            }
        } catch (Exception e) {
            System.out.println("Что-то пошло не так...");
        }
    }
    
    public static void Reader(List<Dictionary<String, String>> args){
        try {
            String pathProject = System.getProperty("user.dir");
           
            String pathFile = pathProject.concat("/HomeWork2/Task2.txt");
            BufferedReader bufread = new BufferedReader(new FileReader(pathFile, StandardCharsets.UTF_8));
            String line = bufread.readLine();
            System.out.println(line + "\n");
            bufread.close();
        } catch (Exception e) {
            System.out.println("Что-то пошло не так...");
        }
    }
}