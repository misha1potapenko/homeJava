//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.


import java.util.ArrayList;
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

        ListReverse(listForReturn);
        System.out.print(listForReturn + " ");
    }

    public static LinkedList<Integer> ListReverse(LinkedList<Integer> listForReturn) {
        int count = 0;
        for (int i = listForReturn.size()-1; i >= listForReturn.size()/2; i--) {
            int temp = listForReturn.get(count);
            int temp2 = listForReturn.get(i);
            listForReturn.set(i,temp);
            listForReturn.set(count,temp2);
            count++;
        }
        return listForReturn;
    }

}



