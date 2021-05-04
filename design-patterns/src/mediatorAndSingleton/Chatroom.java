package mediatorAndSingleton;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Chatroom {

	private List<User> users;
	private Bot bot;
	private static SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	public Chatroom() {
		users = new ArrayList<User>();
	}

	public void addUser(User user) {
		users.add(user);
		user.setChatroom(this);
	}

	public void sendMessage(User user, String message) {
		if (users.contains(user)) {
			
			if (bot == null) {
				
				if (message.contains("addBot")) {
					bot = Bot.getInstance();
					writeMessage("admin", "Bot successfully added!");
				} else {
					writeMessage(user.getName(), message);
				}
				
			} else {
				
				String w = bot.checkForBannedWords(message);
				if (w == null) {
					writeMessage(user.getName(), message);
				}
				else {
					users.remove(user);
					writeMessage("bot", String.format("%s has been banned for using the word '%s'!", user.getName(), w));
				}
				
			}
		}
	}

	private void writeMessage(String name, String message) {
		System.out.println(String.format("%s: %s (%s)", name, message, dateFormat.format(System.currentTimeMillis())));
	}

}
