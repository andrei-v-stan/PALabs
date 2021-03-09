import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {


            LinkedList<String> listL = new LinkedList<String>();

            listL.addFirst("H0");
            listL.add("H1");
            listL.add("H3");
            listL.add("H4");
            listL.addLast("H2");
            listL.add(2, "H12");

            System.out.println(listL);

            listL.remove("H12");
            listL.remove(3);
            listL.removeFirst();
            listL.removeLast();

            System.out.println(listL);



    }

}
