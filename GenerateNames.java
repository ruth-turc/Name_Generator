import java.util.ArrayList;

public class GenerateNames{
    char gender; //'f' for female, 'm' for male
    String name;

    /*
    * constructor class for the Generate Names function
    */
    public GenerateNames(char newGender){
        gender = newGender;
        name = setName();
    }

    /* 
    * sets the name randomly using nameLists class
    */
    private String setName(){
        ArrayList<String> names = nameLists.getNameList(gender);
        int listLength = names.size();

        int randomIndex = (int)(Math.random()*(listLength-1));

        String newName = names.get(randomIndex);
        return newName;
    }

    public String getName(){
        return name;
    }

    public void getNewName(char newGender){
        gender = newGender;
        name = setName();
    }
}