
import javax.swing.SwingUtilities;

public class tester{

    static GenerateNames name;

    public static void main(String[] args){
        char gender = 'm';

        name = new GenerateNames(gender);

        SwingUtilities.invokeLater(() -> {
            var app = new GUI();
            app.createAndShowGUI();
        });
    }

    public static String sendNameToGUI(){
        return name.getName();
    }

    /*
    * gets input from the GUI and generates a name with GenerateNames 
    */
    public static void getFromGUI(String gender){
        if (gender.equals("male")){
            name.getNewName('m');
        } else if (gender.equals("female")){
            name.getNewName('f');
        }
    }
}