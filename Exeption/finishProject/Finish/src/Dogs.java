import java.io.Serializable;
import java.time.LocalDate;


public class Dogs implements Serializable {
    private String name;
    private LocalDate birhday;
    private String breed;


    public Dogs(String name, LocalDate birhday, String breed) {
        this.name = name;
        this.birhday = birhday;
        this.breed = breed;
    }


}
