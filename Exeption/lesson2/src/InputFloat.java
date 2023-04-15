import java.util.Random;
import java.util.Scanner;

/**
 Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
 и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
 вместо этого, необходимо повторно запросить у пользователя ввод данных.
 2. Если необходимо, исправьте данный код
 (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
 Дан следующий код, исправьте его там, где требуется
 (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
 Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
 Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

*/

public class InputFloat {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        inputUser();
        test2();

    }

    /**
     Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
     и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
     вместо этого, необходимо повторно запросить у пользователя ввод данных.
     */
    static float inputUser(){

            while (true){
                System.out.print("Введите число с плавающей точкой: ");
                if (scanner.hasNextFloat()){
                    float floatNumber = scanner.nextFloat();
                    return floatNumber;
                }
                else{
                    System.out.println("Число для поиска указано некорректно.\nПовторите попытку ввода.");
                    scanner.nextLine();
                }
            }

        }
        //2. Если необходимо, исправьте данный код
        //  (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
        static void test2(){
            try {
                int d = 0;
                double catchedRes1 = intArray[8] / d;
                System.out.println("catchedRes1 = " + catchedRes1);
            } catch (ArithmeticException e) {
                System.out.println("Catching exception: " + e);
            }

        }
    }



