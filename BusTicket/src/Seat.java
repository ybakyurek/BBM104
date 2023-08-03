public class Seat {
    private int seatID;
    private boolean status;
    private Passenger passenger;

    public Seat(int seatID, boolean status, Passenger passenger) {
        this.seatID = seatID;
        this.status = status;
        this.passenger = passenger;
    }

    public int getSeatID() {
        return seatID;
    }

    public void setSeatID(int seatID) {
        this.seatID = seatID;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public String toString() {
        return "Seat "+ seatID + " is reserved. "  + "Passenger Info: " + passenger;
    }
}
