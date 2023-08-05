import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeSet;

public class IO {
    public static void reading(String filePath) {

        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                Manager.list.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writing(TreeSet<Sports> sports, String T) {

        try (FileWriter writer1 = new FileWriter(T)) {
            writer1.write(Manager.tableHeader+"\n");
            for (Sports Team : sports) {
                writer1.write(Team.toString() + "\n");
            }
        } catch (IOException ex) {
            System.out.println("IOException Error");

        }

    }


}
