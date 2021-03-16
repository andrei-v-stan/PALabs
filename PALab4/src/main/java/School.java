
public class School implements Comparable<School> {

    String name;

    public School(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public int compareTo(School schoolName) {
        return name.compareTo(schoolName.getName());
    }

}
