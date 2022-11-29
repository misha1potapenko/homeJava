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
            String str1;
            while((str1 = reader.readLine())!= null){
//                System.out.println(str);
                String str2 = str1.replace("\"","");
                String str = str2.replace("}","");
                String[] words = str.split(",");
//                for (String name1: words) {
//                    System.out.println(name1);
                  String forName = words[0];
                  String forCountry = words[1];
                  String forCity = words[2];
                  String[] surname = forName.split(":");
                  String[] mark = forCountry.split(":");
                  String[] subject = forCity.split(":");
                  StringBuilder sql = new StringBuilder();
                  sql.append("Студент ");
                  sql.append(surname[1]);
                  sql.append(" ");
                  sql.append("получил оценку ");
                  sql.append(mark[1]);
                  sql.append(" ");
                  sql.append("по предмету ");
                  sql.append(subject[1]);
                  sql.append(" ");
                  System.out.println(sql);

            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
