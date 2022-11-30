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
        System.out.println("Начальный список: " + num);


        int min = num.get(0);
        for (int i = 0; i < quantity; i++) {
            if(min > num.get(i)) min = num.get(i);

        }
        int max = num.get(0);
        for (int i = 0; i < quantity; i++) {
            if(max < num.get(i)) max = num.get(i);

        }
        float sum = 0f;
        for (int i = 0; i < quantity; i++) {
            sum = sum + num.get(i);

        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        System.out.println("Avr = " + sum/quantity);
    }
}