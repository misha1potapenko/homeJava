import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Input {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        inputSurname();
    }
    static void inputSurname(){
        System.out.println("Введите фамилию: ");
        String surname = scanner.next();
        System.out.println("Введите имя: ");
        String name = scanner.next();
        System.out.println("Введите отчетво: ");
        String patronymic = scanner.next();
        System.out.println("Введите дату рождения формата dd.mm.yyyy: ");
        String birthday = scanner.next();
        // проверяем что ввел пользователь (переберем строку по элементам)
        String forBirthday = "12.12.1988"; // для проверки создаем образец
        System.out.println("Введите номер телефона ");
        String phone = scanner.next();

        try {
            for (int i = 0; i < birthday.length(); i++) {
                if (birthday.charAt(2) != forBirthday.charAt(2) || birthday.charAt(5) != forBirthday.charAt(5)){
                    System.out.println("Вы ввели не корректно точки  \n" +
                            "Введите дату рождения формата dd.mm.yyyy: ");
                    birthday = scanner.next();

                }

            }
        }    catch(Exception ex) {

            System.out.println(ex.getMessage());
        }



        try(FileWriter writer = new FileWriter(surname, true)) { // создаем файл для записи
            writer.write(surname);
            writer.write(" ");
            writer.write(name);
            writer.write(" ");
            writer.write(patronymic);
            writer.write(" ");
            writer.write(birthday);
            writer.write(" ");
            writer.write(phone);

        }
        catch(IOException ex) {

            System.out.println(ex.getMessage());
        }
    }


}
