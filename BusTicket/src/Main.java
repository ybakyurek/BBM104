import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to BusTicket");
        String menu = """
                1-Book a seat\s
                2-Cancel booking
                3-Print all passengers
                4-Print available seats
                5-Print all seats
                6-Search passenger
                7-Exit
                Please enter your choose:""";
        System.out.println(menu);
        Scanner scan = new Scanner(System.in);
        int value = 0;

        while(value!=7) {
            value = scan.nextInt();
            switch (value) {
                case 1 -> {
                    System.out.println("1");
                    System.out.println("test");
                }
                case 2 -> System.out.println("2");
                case 3 -> System.out.println("3");
                case 4 -> System.out.println("4");
                case 5 -> System.out.println("5");
                case 6 -> System.out.println("6");
                case 7 -> System.out.println("You're welcome, thank you for choosing us.");
                default -> System.out.println("Please choose available number");
            }
        }







//        Phone p = new Phone("TR",5322208,"Mobile");
//        System.out.println(p.toString());
//        Bus bus = new Bus("06HUBM06",42, new Seat[42]);
    }

}