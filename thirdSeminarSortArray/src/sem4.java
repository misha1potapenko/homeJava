// 1. Принимает от пользователя строку вида
// text~num
// 2. Нужно разделить строку по ~, сохранить text в связный список на
// позицию num.
// 3. Если введено print~num, выводит строку из позиции num в связном
// списке и удаляет её из списка


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class sem4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedList<String> strings = new LinkedList<>();
        System.out.println("Введите текст с числом через ~ ");
        while (true){
            String str = scan.nextLine();
            if (str.equals("q")) return;

            String[] textAndIndex = str.split("~");

            if (textAndIndex[0].equals("print")){
                String res = strings.remove(Integer.parseInt(textAndIndex[1]));
                System.out.println(res);
            }
            else {
                strings.add(Integer.parseInt(textAndIndex[1]), textAndIndex[0]);
            }

            System.out.println(strings);
        }
    }

}
