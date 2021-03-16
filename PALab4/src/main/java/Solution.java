import java.util.*;


public class Solution {

    List<Student> students = new LinkedList();

    public Student getIndexStudent(List<Student> studentList, int index) {
        int iterator;

        if (studentList.size() > index) {
            iterator = studentList.size() - 1;
        } else {
            iterator = index - 1;
        }
        return (Student) studentList.get(iterator);
    }

    public School getIndexSchool(TreeSet<School> schoolList, int index) {
        int counter = 0;

        for (Iterator variable = schoolList.iterator(); variable.hasNext(); counter++) {
            School students = (School) variable.next();

            if (index == counter) {
                return students;
            }
        }

        return (School) students;
    }


    public void solutions(List<Student> studentList, TreeSet<School> schoolsList) {


    }
}
