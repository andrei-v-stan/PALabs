import com.github.javafaker.Faker;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Maps {

    List<Student> students = new LinkedList();
    TreeSet<School> schools = new TreeSet();
    LinkedHashMap<String, String> studentsHashMap = new LinkedHashMap<String, String>();
    HashMap<String, String> schoolsHashMap = new HashMap<>();

    public Maps() {

        Faker faker = new Faker();

        List<Student> students = (LinkedList<Student>) IntStream
                .rangeClosed(0, 3)
                .mapToObj(rangeIterator -> new Student("S" + rangeIterator))
                .collect(Collectors.toCollection(LinkedList::new));

        Collections.sort(students,
                ((student1, student2) -> student1.getName().compareTo(student2.getName())));


        TreeSet<School> schools = (TreeSet<School>) IntStream
                .range(0, 3)
                .mapToObj(rangeIterator -> new School("H" + rangeIterator))
                .collect(Collectors.toCollection(TreeSet::new));

        studentsHashMap.put(students.get(0).getName() + ": ", "(" + schools.first().getName() + ",H1," + schools.last().getName() + ")");
        studentsHashMap.put(students.get(1).getName() + ": ", "(" + schools.first().getName() + ",H1," + schools.last().getName() + ")");
        studentsHashMap.put(students.get(2).getName() + ": ", "(" + schools.first().getName() + ",H1" + ")");
        studentsHashMap.put(students.get(3).getName() + ": ", "(" + schools.first().getName() + "," + schools.last().getName() + ")");

        schoolsHashMap.put(schools.first().getName() + ": ", "(" + students.get(3).getName() + "," + students.get(0).getName() + "," + students.get(1).getName() + "," + students.get(2).getName() + ")");
        schoolsHashMap.put("H1" + ": ", "(" + students.get(0).getName() + "," + students.get(2).getName() + "," + students.get(1).getName() + ")");
        schoolsHashMap.put(schools.last().getName() + ": ", "(" + students.get(0).getName() + "," + students.get(2).getName() + "," + students.get(1).getName() + ")");


    }
}
