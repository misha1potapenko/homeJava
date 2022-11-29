//Реализуйте алгоритм сортировки пузырьком числового массива,
//        результат после каждой итерации запишите в лог-файл.

import java.awt.datatransfer.FlavorEvent;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class second {
    public static void main(String[] args) throws IOException {
        Double[] bubble = new Double[] {1.0, 5.0, 2.3, 4.6, 8.9, -3.6, 5.4, -12.5, 27.0};

        Logger log = Logger.getLogger("log");
        FileHandler fh = new FileHandler("log.txt");
        for(int i = 0; i < bubble.length - 1; i++){
            for(int j = 0; j < bubble.length - i - 1; j++){
                log.addHandler(fh);
                SimpleFormatter sFormat = new SimpleFormatter();
                fh.setFormatter(sFormat);
                String s = Arrays.toString(bubble);
                log.info(s);
                if (bubble[j + 1] < bubble[j]) {
                    double temp  = bubble[j];
                    bubble[j] = bubble[j + 1];
                    bubble[j + 1] = temp;
                }
            }
        }
    }
}
