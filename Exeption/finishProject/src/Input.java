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

        while (true) {
            try {
                if (birthday.charAt(2) == forBirthday.charAt(2) && birthday.charAt(5) == forBirthday.charAt(5) &&
                        birthday.length() == 10)  {
                    break;}
                else {
                    System.out.println("Введите корректно дату рождения ");
                    birthday = scanner.next();
                    break;
                }
            } catch (StringIndexOutOfBoundsException ex2){

                System.out.println(ex2.getMessage());
                System.out.println("Введите корректно дату рождения ");
                birthday = scanner.next();
                break;
            }



        }




        String phone = null;
        while (true) {
            try {
                System.out.println("Введите номер телефона ");
                phone = Integer.toString(scanner.nextInt()); // преобразовали int  в строку, так как в файл пишется строка
                break;
            } catch (Exception ex1) {
                System.out.println(ex1.getMessage());
            }
        }
        String gender = null;
        while (true){
            System.out.println("Введите пол (f или m ): ");
            gender = scanner.next();
            if (gender.equals("f") || gender.equals("m")) {
                break;
            }
                else System.out.println("Вы ввели не верно, введите один из вариантов");
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
            writer.write(" ");
            writer.write(gender);

        }
        catch(IOException ex) {

            System.out.println(ex.getMessage());
        }
    }


}
