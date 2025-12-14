public class GenerateNames{
    char gender; //'f' for female, 'm' for male, or 'n' for gender nuetral
    String name;

    public GenerateNames(char newGender){
        gender = newGender;
        name = setName();
    }

    private String setName(){
        return "BOB";
    }

    private void getNameList(){
        
    }

    public String getName(){
        return name;
    }

    public void changeGender(char newGender){
        gender = newGender;
    }
}