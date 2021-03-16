
import java.util.Comparator;

public class Student {

    String name;

    public Student(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public static Comparator<Student> studentComparator = new Comparator<Student>() {
        @Override
        public int compare(Student studentName1, Student studentName2) {
            return studentName1.getName().compareTo(studentName2.getName());
        }
    };

}
