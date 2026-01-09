public class tester{

    public static void main(String[] args){
        char gender = 'm';
        String characterName;

        GenerateNames name = new GenerateNames(gender);
        characterName = name.getName();

        System.out.println(characterName);

        name.getNewName('f');
        characterName = name.getName();

        System.out.println(characterName);
    }
}