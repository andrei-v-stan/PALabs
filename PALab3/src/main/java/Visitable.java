import java.util.List;

public interface Visitable {

    String getOpenHoursFrom();

    void setOpenHoursFrom(String hours);

    String getOpenHoursUntil();

    void setOpenHoursUntil(String hours);


    default void setOpenHours() {
        this.setOpenHoursFrom("09:30");
        this.setOpenHoursUntil("20:00");

    }


    static int getVisitingDuration(List<Location> locations, int index) {

        Duration duration = new Duration();

        int hoursFrom, hoursUntil, hoursCalculated;

        hoursFrom = Integer.parseInt(((Location) locations.get(index)).getOpenHoursFrom());
        hoursUntil = Integer.parseInt(((Location) locations.get(index)).getOpenHoursUntil());

        hoursCalculated = hoursUntil - hoursFrom;

        if(hoursCalculated < 0){
            hoursCalculated = hoursCalculated * (-1);
        }

        System.out.println(hoursCalculated);

        duration.setAmmountOfTime(hoursCalculated);

        return (duration.getAmmountOfTime());
    }
}

