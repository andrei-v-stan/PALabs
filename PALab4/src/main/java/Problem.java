import java.util.*;
import java.util.stream.Stream;

public class Problem {

    private List<Student> studentsList = new LinkedList();
    private TreeSet<School> schoolsList = new TreeSet();
    Stream<String> stream = Stream.of("S0: (H0, H1, H2)", "S1: (H0, H1, H2)", "S2: (H0, H1)", "S3: (H0, H2)");
    List<Student> students = new LinkedList();
    TreeSet<School> schools = new TreeSet();

    public List<Student> getStudents() {
        return studentsList;
    }

    public void setStudents(List<Student> students) {
        this.studentsList = studentsList;
    }

    public TreeSet<School> getSchools() {
        return schoolsList;
    }

    public void setSchools(TreeSet<School> schools) {
        this.schoolsList = schoolsList;
    }

    public void printProperSituations() {
        stream.filter(streamS -> streamS.contains("H0"))
                .map(String::toUpperCase)
                .peek(streamS -> System.out.println("" + streamS))
                .count();
    }

    public void solution() {
        Solution solution = new Solution();
        System.out.println();
        solution.solutions(this.studentsList, this.schoolsList);
    }
}
