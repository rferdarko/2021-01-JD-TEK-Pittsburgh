import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainRunner {
    public static void main(String[] args) {

        // field
        List<String[]> data = null;  // created an arraylist containing a String array

        // location
        String location = "src/test/info.txt";  // location of text file to read from

        try {            // try this
            // file
            File file = new File(location);   //  File is file
            data = new ArrayList<String[]>(); // data is stored in a new array lis containing a String array
            // Scanner
            Scanner scan = new Scanner(file);  // calls on Scanner to read the file
            // loop
            while (scan.hasNextLine()) {        // while the scanner has the next line
                String record = scan.nextLine(); // record the String in its entirety from the next line
                data.add(record.split(",")); // split the data at the "," and add it to the array
            }
        } catch (FileNotFoundException e) {  // catch the File Not Found exception
                e.printStackTrace(); // Print Stack Trace for errors
        } finally {                     // finally
            System.out.println("Done"); // print out message
        }
        for (String[] item:data){        // for loop for String array, like a Python dictionary
            System.out.println(item[0] + item[1] + item[2]); // print the array elements
        }


    }
}
