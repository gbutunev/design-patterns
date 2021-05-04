package mediatorAndSingleton;

import java.util.ArrayList;
import java.util.List;

public class Bot {

	private static Bot instance;
	private List<String> bannedWords;

	private Bot() {
		bannedWords = new ArrayList<>();
		bannedWords.add("cat");
	}

	public static Bot getInstance() {
		if (instance == null) {
			instance = new Bot();
		}

		return instance;
	}

	public String checkForBannedWords(String message) {
		for(String word : bannedWords) {
			if (message.contains(word)) {
				return word;
			}
		}
		return null;
	}

}
