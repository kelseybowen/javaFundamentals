import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class PuzzleTest {
    public static void main(String[] args) {
        PuzzleJava appTest = new PuzzleJava();

    Random randMachine = new Random();

    ArrayList<Integer> randomRolls = new ArrayList<Integer>();
    System.out.println("Get 10 Rolls: " + appTest.getTenRolls(randomRolls));
    System.out.println("Get Random Letter: " + appTest.getRandomLetter());
    System.out.println("Generate Password: " + appTest.generatePassword());
    System.out.println("Get New Password Set: " + appTest.getNewPasswordSet(5));
    }
}
