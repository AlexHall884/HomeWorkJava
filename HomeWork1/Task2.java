package HomeWork1;
// 2. Вывести все простые числа от 1 до 1000 
public class Task2 {
    public static void main(String[] args) {
        
        for(int i = 2; i < 1000; ++i){ // начинаем с 2, потому что 1 и 0 не являются простыми числами
            int count = 0;
            for(int j = 2; j < i;++j){
              if(i % j == 0){
                ++count;
              }
            }
            if(count < 2)
               System.out.println(i);
          }
    }
}
