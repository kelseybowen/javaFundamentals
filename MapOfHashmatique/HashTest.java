import java.util.HashMap;
import java.util.Set;

public class HashTest {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Partridge in a Pear Tree", "Here are some lyrics");
        trackList.put("Two Turtledoves", "Some more lyrics");
        trackList.put("Three Frenchhens", "Even more lyrics");
        trackList.put("Four Callingbirds", "Still more lyrics");

        Set<String> titles = trackList.keySet();
        for (String title : titles) {
            System.out.println(title + ": " + trackList.get(title));
            // System.out.println();
        }
    }
}


