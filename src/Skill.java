
import java.util.ArrayList;
import java.util.List;

public class Skill {
    private String name;
    private String description;

    //Constructor
    public Skill(String name, String description) {
        this.name = name;
        this.description = description;
    }

    //Getter

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
