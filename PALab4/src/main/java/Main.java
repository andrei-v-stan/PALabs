
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Maps map = new Maps();
        List<String> elements = new ArrayList<String>(map.schoolsHashMap.keySet());

        Iterator<String> itr = map.schoolsHashMap.keySet().iterator();
        Collections.reverse(elements);

        System.out.println("\nstudents preferences");
        for (Map.Entry element : map.studentsHashMap.entrySet()) {
            System.out.println(element.getKey() + "" + element.getValue());
        }

        System.out.println("\nschools preferences");
        for (String index : elements) {
            System.out.println(index + "" + map.schoolsHashMap.get(index));
        }

        System.out.println("\n");

        new Fakes();

        System.out.println("\n");

        Problem prob = new Problem();
        prob.printProperSituations();

    }

}

