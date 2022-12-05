import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class PuzzleJava {

    Random randMachine = new Random();
    String[] letters = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

    public ArrayList<Integer> getTenRolls(ArrayList<Integer> randomRolls) {
        
        for (int i = 0; i < 10; i++) {
            randomRolls.add(randMachine.nextInt(21)); 
        }
        return randomRolls;
    }

    public String getRandomLetter() {
        int result = randMachine.nextInt(26);
        return letters[result];
    }

    public String generatePassword() {
        String password = "";
        for (int i=0; i<8; i++) {
            String result = getRandomLetter();
            password += result;
        }
        return password;
    }

    public ArrayList<String> getNewPasswordSet(int arrLength) {
        ArrayList<String> passwordArray = new ArrayList<String>();
        for (int i=0; i<arrLength; i++) {
            String result = generatePassword();
            passwordArray.add(result);
        }
        return passwordArray;
    }
}