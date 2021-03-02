import java.util.ArrayList;
import java.util.Arrays;


class Solution {

    private ArrayList<Source> sources;
    private ArrayList<Destination> destinations;
    private int[][] costs;
    int cost;
    int iterator;


    public Solution(ArrayList<Source> sources, ArrayList<Destination> destinations, int[][] costs) {
        this.sources = sources;
        this.destinations = destinations;
        this.costs = costs;
    }


    public ArrayList<Source> getSources() {
        return sources;
    }

    public void setSources(ArrayList<Source> sources) {
        this.sources = sources;
    }

    public ArrayList<Destination> getDestinations() {
        return destinations;
    }

    public void setDestinations(ArrayList<Destination> destinations) {
        this.destinations = destinations;
    }

    public int[][] getCosts() {
        return costs;
    }

    public void setCosts(int[][] costs) {
        this.costs = costs;
    }


    @Override
    public String toString() {
        return "Problem{" +
                "sources=" + sources +
                ", destinations=" + destinations +
                ", costs=" + Arrays.toString(costs) +
                '}';
    }


    /**
     * <p>This method determines the entire transport cost of a destination to all the sources.</p>
     *
     * @param destination
     * @return
     */
    public int getDestinationCost(Destination destination) {

        if (!destinations.contains(destination)) {
            return 0;
        } else {
            cost = 0;
            for (iterator = 0; iterator < sources.size(); iterator++) {
                cost = cost + destination.getDemand() * costs[iterator][destinations.indexOf(destination)];
            }
            return cost;
        }
    }


    /**
     * <p>This method determines and prints the transport cost of a source to a destination.</p>
     *
     * @param source
     * @param destination
     */
    public void getCost(Source source, Destination destination) {
        if (((!sources.contains(source)) || (!destinations.contains(destination))) || ((sources.contains(source) && (!destinations.contains(destination)))) || ((!sources.contains(source) && (destinations.contains(destination))))) {
            System.out.println("Either the source or the destination is or is not found. ");
        } else {
            System.out.println(source.getName() + "->" + destination.getName() + " : " + source.getSupply() * costs[sources.indexOf(source)][destinations.indexOf(destination)]);
        }

    }


}
