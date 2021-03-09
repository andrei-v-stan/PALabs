
public class Restaurant extends Location implements Visitable,Payable,Classifiable {

    public Restaurant(String name, int classifiable, int payable, int visitable){
        this.name = name;

        this.setIsClassifiable(classifiable);
        this.setIsPayable(payable);
        this.setIsVisitable(visitable);
    }

    private String openHoursUntil;
    private String openHoursFrom;


    public String getOpenHoursFrom() {
        return this.openHoursFrom;
    }

    public void setOpenHoursFrom(String openHoursFrom) {
        this.openHoursFrom = openHoursFrom;
    }

    public String getOpenHoursUntil() {
        return this.openHoursUntil;
    }

    public void setOpenHoursUntil(String openHoursUntil) {
        this.openHoursUntil = openHoursUntil;
    }
}
