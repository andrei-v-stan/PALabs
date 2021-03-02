import java.util.ArrayList;

public class Problem {

    public Problem() {

        int[] array1 = {2, 3, 1};
        int[] array2 = {5, 4, 8};
        int[] array3 = {5, 6, 8};

        Source S1 = new Factory("S1", array1, 10);
        Source S2 = new Warehouse("S2", array2, 35);
        Source S3 = new Warehouse("S3", array3, 25);

        Destination D1 = new Destination("D1", 20);
        Destination D2 = new Destination("D2", 25);
        Destination D3 = new Destination("D3", 25);

        System.out.print("\n");

        System.out.println(S1.toString());
        System.out.println(S2.toString());
        System.out.println(S3.toString());

        System.out.print("\n");

        System.out.println(D1.toString());
        System.out.println(D2.toString());
        System.out.println(D3.toString());

        System.out.print("\n");


        int[] S1capacity = S1.getCapacity();
        int[] S2capacity = S2.getCapacity();
        int[] S3capacity = S3.getCapacity();
        int iterator;
        int[][] costs = {{2, 3, 1}, {5, 4, 8}, {5, 6, 8}};


        System.out.print("\n\t\t" + D1.getName() + "\t" + D2.getName() + "\t" + D3.getName() + "\t  Supply");


        System.out.print("\n\t" + S1.getName() + "\t");
        for (iterator = 0; iterator < S1capacity.length; iterator++)
            System.out.print(S1capacity[iterator] + "\t");
        System.out.print("\t" + S1.getSupply());

        System.out.print("\n\t" + S2.getName() + "\t");
        for (iterator = 0; iterator < S2capacity.length; iterator++)
            System.out.print(S2capacity[iterator] + "\t");
        System.out.print("\t" + S2.getSupply());

        System.out.print("\n\t" + S3.getName() + "\t");
        for (iterator = 0; iterator < S3capacity.length; iterator++)
            System.out.print(S3capacity[iterator] + "\t");
        System.out.print("\t" + S3.getSupply());


        System.out.print("\nDemand\t" + D1.getDemand() + "\t" + D2.getDemand() + "\t" + D3.getDemand() + "\n");


        System.out.print("\n");

        ArrayList<Source> sources = new ArrayList<Source>();
        ArrayList<Destination> destinations = new ArrayList<Destination>();

        sources.add(S1);
        sources.add(S2);
        sources.add(S3);

        destinations.add(D1);
        destinations.add(D2);
        destinations.add(D3);

        System.out.print("\n");

        Solution solution = new Solution(sources, destinations, costs);

        System.out.println(solution.toString());

        System.out.print("\n");

        System.out.println("D1 has the total cost of : " + solution.getDestinationCost(D1));
        System.out.println("D2 has the total cost of : " + solution.getDestinationCost(D2));
        System.out.println("D3 has the total cost of : " + solution.getDestinationCost(D3));

        System.out.print("\n");

        solution.getCost(S1, D1);
        solution.getCost(S1, D2);
        solution.getCost(S1, D3);
        solution.getCost(S2, D1);
        solution.getCost(S2, D2);
        solution.getCost(S2, D3);
        solution.getCost(S3, D1);
        solution.getCost(S3, D2);
        solution.getCost(S3, D3);
    }

}
