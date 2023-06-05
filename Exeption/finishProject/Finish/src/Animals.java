import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
//В программе должен быть реализован следующий функционал:
//        14.1 Завести новое животное
//        14.2 определять животное в правильный класс
//        14.3 увидеть список команд, которое выполняет животное
//        14.4 обучить животное новым командам
//        14.5 Реализовать навигацию по меню
//        15.Создайте класс Счетчик, у которого есть метод add(), увеличивающий̆
//        значение внутренней̆int переменной̆на 1 при нажатие “Завести новое
//        животное” Сделайте так, чтобы с объектом такого типа можно было работать в
//        блоке try-with-resources. Нужно бросить исключение, если работа с объектом
//        типа счетчик была не в ресурсном try и/или ресурс остался открыт. Значение
//        считать в ресурсе try, если при заведения животного заполнены все поля.



public class Animals {

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
                    System.out.println("Введите корректно дату рождения dd.mm.yyyy:");
                    birthday = scanner.next();
                    break;
                }
            } catch (StringIndexOutOfBoundsException ex2){

                System.out.println(ex2.getMessage());
                System.out.println("Введите корректно дату рождения dd.mm.yyyy: ");
                birthday = scanner.nextLine();
                break;
            }



        }




        String phone;
        while (true) {
            try {
                System.out.println("Введите номер телефона ");
                phone = String.valueOf(scanner.nextInt()); // преобразовали int  в строку, так как в файл пишется строка
                break;
            } catch (InputMismatchException ex1) {
                System.out.println(ex1.getMessage());
                System.out.println("Введите корректно номер телефона");
                scanner.nextLine();
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

