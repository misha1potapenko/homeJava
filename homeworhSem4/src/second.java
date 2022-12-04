//Реализуйте очередь с помощью LinkedList со следующими методами:
//        enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый
//        элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.


import java.util.LinkedList;
import java.util.Scanner;

public class second{
    public static void main(String[] args) {
        LinkedList<Integer> firstLastPosition = new LinkedList<>();
        firstLastPosition.add(2332);
        firstLastPosition.add(2);
        firstLastPosition.add(456);
        System.out.println(firstLastPosition);
//        enqueue(firstLastPosition);
//        first(firstLastPosition);
        dequeue(firstLastPosition);
        System.out.println(firstLastPosition);
    }
    public static LinkedList<Integer> enqueue(LinkedList<Integer> linkedList){
        System.out.print("Введите число для добавления в конец LinkedList: ");
        Scanner forFinish = new Scanner(System.in);
        int finish = forFinish.nextInt();
        linkedList.addLast(finish);
        return linkedList;
    }
    public static void  first(LinkedList<Integer> linkedList) {

        int first = linkedList.getFirst();
        System.out.println(first);
    }
    public static LinkedList<Integer> dequeue(LinkedList<Integer> linkedList){
        int first = linkedList.pollFirst();
        System.out.println(first);
        return linkedList;
    }
}