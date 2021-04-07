import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainRunner {
    public static void main(String[] args) {

        // field
        List<String[]> data = null;

        // location
        String location = "src/test/info.txt";

        try {
            // file
            File file = new File(location);
            data = new ArrayList<String[]>();
            // Scanner
            Scanner scan = new Scanner(file);
            // loop
            while (scan.hasNextLine()) {
                String record = scan.nextLine();
                data.add(record.split(","));
            }
        } catch (FileNotFoundException e) {
                e.printStackTrace();
        } finally {
            System.out.println("Done");
        }
        for (String[] item:data){
            System.out.println(item[0] + item[1] + item[2]);
        }


    }
}
