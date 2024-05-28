import java.util.ArrayList;
import java.util.List;

public class Colleague {
    private String name;
    private String subsidiary;

    private List<Skill> skills;

    private List<String> qualification;

    // Constructor
    public Colleague(String name, String subsidiary, List<Skill> skills, List<String> qualification) {
        this.name = name;
        this.subsidiary = subsidiary;
        this.skills = skills;
        this.qualification = qualification;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getSubsidiary() {
        return subsidiary;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public List<String> getQualification() {
        return qualification;
    }
    //Setters

    public String setName(){
        return name;
    }
    public String setSubsidiary() {
        return subsidiary;
    }
    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
    public void setQualification(List<String> qualification){
        this.qualification = qualification;
    }




}
