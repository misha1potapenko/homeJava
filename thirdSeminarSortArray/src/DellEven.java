//  Реализовать алгоритм сортировки слиянием.
//  Пусть дан произвольный список целых чисел. Удалить из него чётные числа.
//  Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.

//  Пусть дан произвольный список целых чисел. Удалить из него чётные числа.
import java.util.ArrayList;
import java.util.Scanner;

public class DellEven {
    public static void main(String[] args) {
        System.out.print("Введите количество чисел: ");
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[num1];
        for (int i = 0; i < num1; i++) {
            System.out.print("Введите целое число, для внесеня в список: ");
            int value = scanner.nextInt();
            arr[i] = value;
        }
        System.out.print("Начальньный список: ");
        for (int each : arr) {
            System.out.print(each + " ");
        }
        System.out.println();
        ArrayList<Integer> listNumbers = new ArrayList<>();
//        преобразуем массив в список
        for (int i: arr) {
            if (i % 2 == 0) continue;
            else
                listNumbers.add(Integer.valueOf(i));
        }
        System.out.print("Список без четных чисел: ");
        System.out.println(listNumbers);


    }
}