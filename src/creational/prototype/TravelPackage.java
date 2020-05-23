package creational.prototype;

public class TravelPackage implements Cloneable {

    private String name;
    private Hotel hotel;
    private Flight flight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public TravelPackage(){}

    public TravelPackage(TravelPackage travelPackage){
        this.name = travelPackage.getName();
        this.hotel = new Hotel(travelPackage.getHotel());
        this.flight = new Flight(travelPackage.getFlight());
    }

    @Override
    protected TravelPackage clone(){
        return new TravelPackage(this);
    }

    @Override
    public String toString() {
        return "TravelPackage{" +
                "name='" + name + '\'' +
                ", hotel=" + hotel +
                ", flight=" + flight +
                '}';
    }
}
