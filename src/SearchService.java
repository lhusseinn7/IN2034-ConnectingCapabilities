
import java.util.ArrayList;
import java.util.List;

public class SearchService {

    private List<Colleague> colleagues;

    // Constructor to initialise the colleagues list
    public SearchService(List<Colleague> colleagues) {
        this.colleagues = colleagues;
    }

    // Method to search colleagues by skill
    public List<Colleague> searchBySkill(String skillName) {
        List<Colleague> filteredColleagues = new ArrayList<>();
        for (Colleague colleague : colleagues) {
            for (Skill skill : colleague.getSkills()) {
                if (skill.getName().equalsIgnoreCase(skillName)) {
                    filteredColleagues.add(colleague);
                    break;
                }
            }
        }
        return filteredColleagues;
    }

    // Main method to demonstrate the search functionality
    public static void main(String[] args) {
        List<Colleague> colleagues = new ArrayList<>();

        SearchService searchService = new SearchService(colleagues);
        String searchSkill = "java";
        List<Colleague> searchResults = searchService.searchBySkill(searchSkill);

        System.out.println("Colleagues with skill '" + searchSkill + "': " + searchResults);
    }
}
