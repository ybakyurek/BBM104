public class Bus {
    private String plate;
    private int seatCount;
    private Seat[] seats;

    public Bus(String plate, int seatCount, Seat[] seats) {
        this.plate = plate;
        this.seatCount = seatCount;
        this.seats = seats;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public Seat[] getSeats() {
        return seats;
    }

    public void setSeats(Seat[] seats) {
        this.seats = seats;
    }

    public void bookSeat(Passenger p, int seatID){

    }

    public void printAllPassengers(){

    }

    public void printAllAvailableSeatIDs() {

    }

    public void search(){


    }



}
