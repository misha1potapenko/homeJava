import java.util.Random;

/**
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
 и возвращающий новый массив, каждый элемент которого равен разности элементов
 двух входящих массивов в той же ячейке. Если длины массивов не равны,
  необходимо как-то оповестить пользователя.
* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
 и возвращающий новый массив, каждый элемент которого равен частному элементов
  двух входящих массивов в той же ячейке. Если длины массивов не равны,
  необходимо как-то оповестить пользователя. Важно: При выполнении метода
  единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.

*/

public class Main {
    static Random random = new Random();

    public static void main(String[] args) {
        int[] arr1 = new int[random.nextInt(2)+6];  // создание первого массива
        int[] arr2 = new int[random.nextInt(2)+6];   // создание второго  массива
        difArr(arr1,arr2);

    }

    static int[] difArr (int[] arr1, int[] arr2){
        try {
            int[] dif = new int[arr1.length]; // создание третьего массива для добавления разности первых двух
            if (arr1.length != arr2.length) {
                throw new RuntimeException(String.format("Массивы не равны, нужны два  масива равных по длинне"));
            } else
                for (int i = 0; i < arr1.length; i++) {   // заполнение двух массивов данными
                    arr1[i] = random.nextInt(10);
                    arr2[i] = random.nextInt(10);
                }
            System.out.print("Новый массив имеет вид: ");
            for (int i = 0; i < arr1.length; i++) {
                dif[i] = arr1[i] - arr2[i]; // вычисление разности междц двумя массивами
                System.out.printf("%d,", dif[i]);
            }
            return dif;
        }catch (CustomArraySizeException e){
            System.out.println(e.getMessage());
            System.out.printf("Длина первого массива: %d\nДлина второго массива: %d\n",
                    e.getLength1(), e.getLength2());
    }
}

class CustomArraySizeException extends RuntimeException{

    private int length1;
    private int length2;

    public int getLength1() {
        return length1;
    }

    public int getLength2() {
        return length2;
    }

    public CustomArraySizeException(String message, int length1, int length2) {
        super(message);
        this.length1 = length1;
        this.length2 = length2;
    }
}