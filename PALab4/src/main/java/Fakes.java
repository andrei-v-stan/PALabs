import com.github.javafaker.Faker;

public class Fakes {

    String fullName;

    public Fakes() {

        Faker faker = new Faker();
        fullName = faker.name().fullName();

        System.out.println("\n");
        System.out.println("Student S0 name :" + faker.name().fullName());
        System.out.println("Student S1 name :" + faker.name().fullName());
        System.out.println("Student S2 name :" + faker.name().fullName());
        System.out.println("Student S3 name :" + faker.name().fullName());

        System.out.println("School H0 name : " + faker.name().fullName());
        System.out.println("School H1 name : " + faker.name().fullName());
        System.out.println("School H2 name : " + faker.name().fullName());

    }

}