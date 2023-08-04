
public class Main {

    public static void main(String[] args) {

        Manager.creatingTeams("/Users/yba/Documents/GitHub/BBM104Quizzes/Standing Table/fikstur.txt");
        Manager.fillTableOfAllSports();
        System.out.println(Manager.tableHeader);
        for (Sports i : Manager.icehockeys) {
            System.out.println(i);
        }
//        System.out.println(Manager.tableHeader);
//        for (Sports i : Manager.volleyballs) {
//            System.out.println(i);
//        }
//        System.out.println(Manager.tableHeader);
//        for (Sports i : Manager.basketballs) {
//            System.out.println(i);
//        }
//        System.out.println(Manager.tableHeader);
//        for (Sports i : Manager.handballs) {
//            System.out.println(i);
//        }

    }
}
