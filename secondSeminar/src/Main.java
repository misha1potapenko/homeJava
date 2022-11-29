//В файле содержится строка с исходными данными в такой форме:
//        {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
//        Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
//        SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
//
//        Для разбора строки используйте String.split.
//        Сформируйте новую строку, используя StringBuilder. Значения null не включаются в запрос.

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("text.txt");
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            String line1 = line.replace(",","");
            String[] words = line1.split(" ");
            String forName = words[0];
            String forCountry = words[1];
            String forCity = words[2];
            String[] name = forName.split(":");
            String[] country = forCountry.split(":");
            String[] city = forCity.split(":");
            StringBuilder sql = new StringBuilder();
            sql.append("SELECT * FROM students WHERE name = ");
            sql.append(name[1]);
            sql.append(" ");
            sql.append("AND country = ");
            sql.append(country[1]);
            sql.append(" ");
            sql.append("AND city = ");
            sql.append(city[1]);
            sql.append(" ");
            System.out.println(sql);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}