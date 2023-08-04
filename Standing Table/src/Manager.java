import java.util.ArrayList;
import java.util.HashSet;


public class Manager {

    public static ArrayList<String> list = new ArrayList<>();
    public static HashSet<Sports> icehockeys = new HashSet<>();
    public static HashSet<Sports> handballs = new HashSet<>();
    public static HashSet<Sports> basketballs = new HashSet<>();
    public static HashSet<Sports> volleyballs = new HashSet<>();

    public static String tableHeader = String.format("%-20s %4s %4s %4s %4s %4s %4s %4s %4s", "Name", "G", "W", "D", "L", "F", "A", "GD", "P");

    public static void creatingTeams(String filePath) {
        IO.reading(filePath);
        for (String s : list) {
            switch (s.split("\t")[0]) {
                case "I" -> {
                    Icehockey team = new Icehockey(s.split("\t")[1]);
                    Icehockey team2 = new Icehockey(s.split("\t")[2]);
                    icehockeys.add(team);
                    icehockeys.add(team2);
                }
                case "H" -> {
                    Handball team = new Handball(s.split("\t")[1]);
                    Handball team2 = new Handball(s.split("\t")[2]);
                    handballs.add(team);
                    handballs.add(team2);
                }
                case "B" -> {
                    Basketball team = new Basketball(s.split("\t")[1]);
                    Basketball team2 = new Basketball(s.split("\t")[2]);
                    basketballs.add(team);
                    basketballs.add(team2);
                }
                case "V" -> {
                    Volleyball team = new Volleyball(s.split("\t")[1]);
                    Volleyball team2 = new Volleyball(s.split("\t")[2]);
                    volleyballs.add(team);
                    volleyballs.add(team2);
                }

            }//end switch case
        }//end for reading
    }//end creating team

    /*
    Listeyi atinca hesaplamasini yapiyor.
     */
    public static void fillTableWithScores(HashSet<Sports> liste, String gameType) {
        for (String s : list) {
            if (gameType.equals(s.split("\t")[0])) {
                String home = s.split("\t")[1];
                int homeScore = Integer.parseInt(s.split("\t")[3].split(":")[0]);
                String away = s.split("\t")[2];
                int awayScore = Integer.parseInt(s.split("\t")[3].split(":")[1]);
                for (Sports i : liste) {
                    if (i.getName().equals(home)) {
                        i.entryMatch(homeScore, awayScore);
                    }
                    if (i.getName().equals(away)) {
                        i.entryMatch(awayScore, homeScore);
                    }
                    i.calculatePoint();
                }
            }
        }
    }

    public static void fillTableOfAllSports() {
        Manager.fillTableWithScores(Manager.icehockeys,"I");
        Manager.fillTableWithScores(Manager.volleyballs,"V");
        Manager.fillTableWithScores(Manager.basketballs,"B");
        Manager.fillTableWithScores(Manager.handballs,"H");

        /*
        for (String s : list) {
            String home = s.split("\t")[1];
            int homeScore = Integer.parseInt(s.split("\t")[3].split(":")[0]);
            String away = s.split("\t")[2];
            int awayScore = Integer.parseInt(s.split("\t")[3].split(":")[1]);

            switch (s.split("\t")[0]) {
                case "I" -> {

                }
                case "H" -> {


                }
                case "B" -> {


                }
                case "V" -> {


                }
            }
        }
*/

    }


}
