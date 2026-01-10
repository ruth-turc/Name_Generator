import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class GUI {
    
    String selectedGender;

    public void createAndShowGUI(){

        //create JFrame
        JFrame frame = new JFrame("Name Generator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,200);
        frame.setLayout(new FlowLayout());

        //create JPannel
        JPanel panel = new JPanel();

        //create label for displaying the name
        JLabel displayName = new JLabel("Name");

        //create ComboBox
        String[] nameGenders = {"--","male","female"};
        JComboBox genderBox = new JComboBox<>(nameGenders);
        genderBox.setSelectedIndex(0);
        genderBox.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                selectedGender = (String) e.getItem();
            }
        });

        //create button and add action listener
        JButton goButton = new JButton("Get Name");
        goButton.addActionListener((ActionEvent e) -> {
            //send the selected gender to main
            tester.getFromGUI(selectedGender);

            //display new name with displayName label
            displayName.setText(tester.sendNameToGUI());
        });

        //add components to panel
        panel.add(genderBox);
        panel.add(goButton);
        panel.add(displayName);

        //add panel to the frame and set visable
        frame.add(panel);
        frame.setVisible(true);
    }
}