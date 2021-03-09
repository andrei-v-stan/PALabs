import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        City newyork = new City();


        Hotel V1 = new Hotel("v1",1,0,1);
        Church V2 = new Church("v2",0,0,0);
        Church V3 = new Church("v3",1,0,1);
        Museum V4 = new Museum("v4",1,0,0);
        Museum V5 = new Museum("v5",0,1,1);
        Restaurant V6 = new Restaurant("v6",1,0,1);



        newyork.addLocation(V1);
        newyork.addLocation(V2);
        newyork.addLocation(V3);
        newyork.addLocation(V4);
        newyork.addLocation(V5);
        newyork.addLocation(V6);


        V1.maping.put(V2,10);
        V1.maping.put(V3,50);
        V2.maping.put(V3,20);
        V2.maping.put(V4,20);
        V2.maping.put(V5,10);
        V3.maping.put(V4,20);
        V4.maping.put(V5,30);
        V4.maping.put(V6,10);
        V5.maping.put(V6,20);



        System.out.println("\nFrom-To   Cost");
        System.out.println(V1.getName() + "->" + V2.getName() + "  : " + V1.maping.get(V2));
        System.out.println(V1.getName() + "->" + V3.getName() + "  : " + V1.maping.get(V3));
        System.out.println(V2.getName() + "<->" + V3.getName() + " : " + V2.maping.get(V3));
        System.out.println(V2.getName() + "->" + V4.getName() + "  : " + V2.maping.get(V4));
        System.out.println(V2.getName() + "->" + V5.getName() + "  : " + V2.maping.get(V5));
        System.out.println(V3.getName() + "->" + V4.getName() + "  : " + V3.maping.get(V4));
        System.out.println(V4.getName() + "<->" + V5.getName() + " : " + V4.maping.get(V5));
        System.out.println(V4.getName() + "->" + V6.getName() + "  : " + V4.maping.get(V6));
        System.out.println(V5.getName() + "->" + V6.getName() + "  : " + V5.maping.get(V6));



        System.out.println("\n");
        newyork.printVisitableNonPayableLocations();
        System.out.println("\n");



        V1.setOpenHoursFrom("08:00");
        V1.setOpenHoursUntil("17:00");
        V2.setOpenHoursFrom("07:30");
        V2.setOpenHoursUntil("15:45");
        V3.setOpenHoursFrom("12:00");
        V3.setOpenHoursUntil("18:00");
        V4.setOpenHoursFrom("12:00");
        V4.setOpenHoursUntil("00:00");
        V6.setOpenHoursFrom("10:00");
        V6.setOpenHoursUntil("00:00");



        List<Location> locations = new ArrayList<>();

        locations.add(V1);
        locations.add(V2);
        locations.add(V3);
        locations.add(V4);
        locations.add(V5);
        locations.add(V6);



        TravelPlan problem = new TravelPlan();
        problem.setLocationsPlan(locations);
        problem.setCityPlan(newyork);


    }
}
