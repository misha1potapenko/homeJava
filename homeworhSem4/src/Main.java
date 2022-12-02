//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.


import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> listForReturn = new LinkedList<>();
        System.out.println("Введите количество элементов для добавления в LinkedList: ");
        Scanner forLinked = new Scanner(System.in);
        int quantity = forLinked.nextInt();
        for (int i = 0; i < quantity ; i++) {
            listForReturn.add(i,i);

        }
        System.out.print(listForReturn + " ");
        System.out.println();
        for (int i = quantity; i > 0 ; i--) {
            listForReturn.add(i, i);
        }
        System.out.print(listForReturn + " ");
    }
}