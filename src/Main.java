
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Colleague> colleagues = Arrays.asList(
              //  new Colleague(1, "John Doe", Arrays.asList(new Skill("Java", "Experienced Java developer")), null, "US"),
               // new Colleague(2, "Jane Smith", Arrays.asList(new Skill("Java", "Junior Java developer")), null, "Canada")
        );

        SearchService searchService = new SearchService(colleagues);
        String searchQuery = "Java";
        List<Colleague> searchResults = searchService.searchBySkill(searchQuery);

        for (Colleague colleague : searchResults) {
            System.out.println("Found: " + colleague.getName() + " in " + colleague.getSubsidiary());
        }
    }
}