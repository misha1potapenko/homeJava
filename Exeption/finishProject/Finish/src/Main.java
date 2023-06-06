import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cat.dat")))
        {

            System.out.println("Введите кличку кота(кошки): ");
            String name = scanner.next();
            System.out.println("Введите год роджения: ");
            int year = scanner.nextInt();
            System.out.println("Введите месяц роджения: ");
            int month = scanner.nextInt();
            System.out.println("Введите день роджения: ");
            int day = scanner.nextInt();
            System.out.println("Введите породу : ");
            String breed = scanner.next();
            Cats cat = new Cats(name, LocalDate.of(year,month, day), breed);
            oos.writeObject(cat);
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }


}