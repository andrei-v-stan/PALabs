import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> tokens = new ArrayList<String>();
        tokens.add("A1 A2");
        tokens.add("A2 A2");
        tokens.add("A2 A3");
        tokens.add("A3 A3");
        System.out.println(tokens);
    }
}

