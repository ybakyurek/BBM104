import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class IO {
    public static void reading(String filePath) {
        String fileName = filePath;

        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                Manager.list.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
