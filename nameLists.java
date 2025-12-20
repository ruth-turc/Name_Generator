import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class nameLists{

    public static ArrayList<String> getNameList(char gender){
        if (gender == 'f'){
            return getFemaleNames();
        } else {
            return getMaleNames();
        }
    }

    /* 
    * Reads from FemaleNames file and returns an array with its
    */
    private static ArrayList<String> getFemaleNames(){
        //set fileName to the name of file
        String fileName = "FemaleNames.txt";
        //create arrayList
        ArrayList<String> names = new ArrayList<>();

        //try to open file
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            // Read until the end of the file (readLine() returns null)
            while ((line = reader.readLine()) != null) {
                //add the read line to the arrayList
                names.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return names;
    }

    private static ArrayList<String> getMaleNames(){
        String fileName = "MaleNames.txt";
        ArrayList<String> names = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            // Read until the end of the file (readLine() returns null)
            while ((line = reader.readLine()) != null) {
                names.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return names;
    }
}