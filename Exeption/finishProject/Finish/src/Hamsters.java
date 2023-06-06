import java.io.Serializable;
import java.time.LocalDate;


public class Hamsters implements Serializable {
    private String name;
    private LocalDate birthday;
    private String breed;


    public Hamsters(String name, LocalDate birthday, String breed) {
        this.name = name;
        this.birthday = birthday;
        this.breed = breed;
    }
}
