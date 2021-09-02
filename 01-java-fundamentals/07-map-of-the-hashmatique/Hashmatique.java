import java.util.HashMap;
import java.util.Set;

public class Hashmatique {

	public static void main(String[] args) {
		HashMap<String, String> trackList = new HashMap<String, String>();
		trackList.put("When Doves Cry", "Dig if you will the picture");
		trackList.put("Take On Me", "Take on me, (take on me)");
		trackList.put("Beat it", "No one wants to be defeated");
		trackList.put("With or Without You", "See the stone set in your eyes");

		Set<String> keys = trackList.keySet();
		String track = trackList.get("When Doves Cry");
		System.out.println("The Song by track title is : " + track + "\n");
		System.out.println("Track : " + "Lyrics");
		System.out.println("-----------------------------" + "\n");
		for (String key : keys) {
			System.out.println(key + " : " + trackList.get(key));
		}

	}

}
