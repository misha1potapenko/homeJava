//В файле содержится строка с данными:
//        [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
//        {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
//        {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//        Напишите метод, который разберёт её на составные части и,
//        используя StringBuilder создаст массив строк такого вида:
//        Студент Иванов получил 5 по предмету Математика.
//        Студент Петрова получил 4 по предмету Информатика.
//        Студент Краснов получил 5 по предмету Физика.


import java.io.*;

public class third {

    public static void main(String[] args) {

        try(FileReader fr = new FileReader("txtForThird.txt"))
        {
            // читаем посимвольно
            BufferedReader reader = new BufferedReader(fr);
            String c;
            while((c = reader.read())== null){

                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
