import java.util.Date;

public class AlfredQuotes{
    public String basicGreeting() {

		return "Hello, lovely to see you. How are you?";
	}

	public String guestGreeting(String name, String dayPeriod) {

		String greeting = String.format("Good %s, %s. Lovely to see you", dayPeriod, name);
        
		return greeting;
	}

	public String dateAnnouncement() {

		Date date = new Date();

		return "Current date is " + date;
	}

	public String respondBeforeAlexis(String conversation) {
		int alexis = conversation.indexOf("Alexis");
		int alfred = conversation.indexOf("Alfred");

		if (alexis != -1) {
			conversation = "Right away, sir. She certainly isn't sophisticated enough for that.";
		} else if (alfred != -1) {
			conversation = "At your service, As you wish, naturally";
		} else {
			conversation = "Right, And with that I shall retire.";
		}
		return conversation;
	}

	public String ConvertToUpperCase(String conversation) {
		return conversation.toUpperCase();

	}
}