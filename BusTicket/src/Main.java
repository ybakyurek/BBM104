import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to BusTicket");
        String menu = "1-Book a seat\n" +
        "2-Cancel booking\n" +
        "3-Print all passengers\n" +
        "4-Print available seats\n" +
        "5-Print all seats\n" +
        "6-Search passenger\n" +
        "7-Exit\n" +
        "Please enter your choose:";
        System.out.println(menu);
        Scanner scan = new Scanner(System.in);
        int value = 0;

        while(value!=7) {
            value = scan.nextInt();
            switch (value) {
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    break;
                case 5:
                    System.out.println("5");
                    break;
                case 6:
                    System.out.println("6");
                    break;
                case 7:
                    System.out.println("You're welcome, thank you for choosing us.");
                    break;
                default:
                    System.out.println("Please choose available number");
                    break;
            }
        }







//        Phone p = new Phone("TR",5322208,"Mobile");
//        System.out.println(p.toString());
//        Bus bus = new Bus("06HUBM06",42, new Seat[42]);
    }

}