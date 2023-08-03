public class Bus {
    private String plate;
    private int seatCount;
    private Seat[] seats;

    public Bus(String plate, int seatCount) {
        this.plate = plate;
        this.seatCount = seatCount + 1;
        this.seats = new Seat[seatCount + 1];//0 is for bus driver:)
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

    public void bookSeat(Passenger p, int seatID) {
        seats[seatID] = new Seat(seatID, false, p);
        System.out.println("Reservation made successfully.");
        System.out.println("Passenger info: " + p + "\n" + "Seat Number: " + seatID);
    }

    public void cancel(String surname, int seatID) {
        if (getSeats()[seatID].getPassenger().getSurname().equals(surname)) {
            seats[seatID] = null;
            System.out.println("Reservation is cancelled");
        } else System.out.println("Seat number or surname is mistake");
    }

    public void printAllPassengers() {
        for (Seat s : getSeats()) {
            if (s != null)
                System.out.println(s);
        }
    }

    public void printAllAvailableSeatIDs() {
        for (int i = 1; i < getSeatCount(); i++) {
            if (getSeats()[i] == null) {
                System.out.printf("%4d ", i);
            } else {
                System.out.printf("%4s ", " ");
            }
            if (i % 4 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public void printAllSeats() {
        for (int i = 1; i < getSeatCount(); i++) {
            if (seats[i] == null) System.out.println("Seat " + i + " is empty");
            else {
                System.out.println(seats[i]);
            }
        }

    }

    public void search(String name, String surname) {
        boolean anyPassenger = false;
        for (Seat s : seats) {
            if (s != null && s.getPassenger().getName().equals(name) && s.getPassenger().getSurname().equals(surname)) {
                System.out.println(s.getPassenger().getPhone() + "\n");

                anyPassenger = true;
            }
        }
        if (!anyPassenger) System.out.println("There is no such passenger\n");
    }
}
