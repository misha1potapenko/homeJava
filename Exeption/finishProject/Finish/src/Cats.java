import java.io.Serializable;
import java.time.LocalDate;


public class Cats implements Serializable {
    private String name;
    private LocalDate birhday;
    private String breed;

    public Cats (String name, LocalDate birhday, String breed) {
        this.name = name;
        this.birhday = birhday;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Cats{" +
                "name='" + name + '\'' +
                ", birhday=" + birhday +
                ", breed='" + breed + '\'' +
                '}';
    }





}
