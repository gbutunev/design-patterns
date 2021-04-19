package observer;

public class Main {

	public static void main(String[] args) {

		NewsBroadcaster nb = new NewsBroadcaster();

		NewsReceiver nr1 = new NewsReceiver("nr1");
		NewsReceiver nr2 = new NewsReceiver("nr2");
		NewsReceiver nr3 = new NewsReceiver("nr3");

		Article a1 = new Article("hello", "more text");
		Article a2 = new Article("bye", "more text 2");

		nb.subscribe(nr1);
		nb.subscribe(nr2);
		nb.subscribe(nr3);

		// first update
		nb.setArticle(a1);

		// second update
		nb.setArticle(a2);

	}

}
