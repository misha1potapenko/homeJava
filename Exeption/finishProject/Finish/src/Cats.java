import java.io.Serializable;
import java.util.Date;

public class Cats implements Serializable {
    private String name;
    private Date birhday;
    private String breed;

    public Cats (String name, Date birhday, String breed) {
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
