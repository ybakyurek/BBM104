import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Simple Bus
        Bus bus = new Bus("06HUBM06", 42);

        //Simple Passengers
        Passenger p = new Passenger("yildirim", "akyurek", "E",
                new Phone("TR", "+90", 5322, "Mobile"));
        bus.bookSeat(p, 12);
        Passenger p2 = new Passenger("asd", "asd", "E",
                new Phone("TR", "+90", 5121, "Mobile"));
        bus.bookSeat(p2, 15);


        System.out.println("Welcome to BusTicket");
        String menu = """
                **** MENU ****
                1-Book a seat\s
                2-Cancel booking
                3-Print all passengers
                4-Print available seats
                5-Print all seats
                6-Search passenger
                7-Exit
                """;

        Scanner scan = new Scanner(System.in);
        int value = 0;

        //Menu system always work until passenger choose 7
        while (value != 7) {
            System.out.print(menu);
            System.out.print("Please enter your choose: ");
            value = scan.nextInt();
            scan.nextLine();
            switch (value) {
                case 1 -> {
                    System.out.print("Enter your seat number:");
                    int seatNumber = scan.nextInt();
                    scan.nextLine();
                    boolean isSelected = false;
                    while (!isSelected) {
                        if (bus.getSeats()[seatNumber] != null) {
                            System.out.println("Seat " + seatNumber + " is reserved. Please choose a new seat");
                            seatNumber = scan.nextInt();
                            scan.nextLine();
                        }
                        else isSelected=true;
                    }

                    System.out.print("Enter your first name:");
                    String name = scan.nextLine();
                    System.out.print("Enter your surname:");
                    String surname = scan.nextLine();
                    System.out.print("Enter your gender(K/E):");
                    String gender = scan.nextLine();
                    System.out.print("Enter your country code:");
                    String countryCode = scan.nextLine();
                    System.out.print("Enter your phone type(mobile/home):");
                    String type = scan.nextLine();
                    System.out.print("Enter your phone code:");
                    String code = scan.nextLine();
                    System.out.print("Enter your number:");
                    int number = scan.nextInt();
                    scan.nextLine();
                    Passenger passenger = new Passenger(name, surname, gender, new Phone(countryCode, code, number, type));
                    bus.bookSeat(passenger, seatNumber);
                }
                case 2 -> {
                    System.out.print("Enter your seat number:");
                    int seatNumber = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Enter your surname:");
                    String surname = scan.nextLine();
                    bus.cancel(surname, seatNumber);

                }
                case 3 -> bus.printAllPassengers();
                case 4 -> bus.printAllAvailableSeatIDs();
                case 5 -> bus.printAllSeats();
                case 6 -> {
                    System.out.print("Enter your name:");
                    String name = scan.nextLine();
                    System.out.print("Enter your surname:");
                    String surname = scan.nextLine();
                    bus.search(name, surname);
                }
                case 7 -> System.out.print("You're welcome, thank you for choosing us.");
                default -> System.out.println("Please choose available number");
            }
        }

    }

}