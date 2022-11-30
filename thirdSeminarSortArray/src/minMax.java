//  Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.

import java.util.ArrayList;
import java.util.Scanner;

public class minMax {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        System.out.print("Введите количество чисел в списке: ");
        Scanner forNum = new Scanner(System.in);
        int quantity = forNum.nextInt();
        for (int i = 0; i < quantity; i++) {
            System.out.print("Введите " + i + " элемент массива: ");
            Scanner num1 = new Scanner(System.in);
            int number = num1.nextInt();
            num.add(i,number);
        }
        System.out.println(num);
    }
}