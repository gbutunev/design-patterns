package observer;

public class NewsReceiver implements Observer {

	private String name;
	private Observable newsBroadcaster;

	public NewsReceiver(String name) {
		this.name = name;
	}

	@Override
	public boolean update() {
		Article article = this.newsBroadcaster.getArticle();

		if (article != null) {
			System.out.println(String.format("%s received:%n%s", name, article.toString()));

			return true;
		}
		return false;
	}

	@Override
	public boolean setObservable(Observable newsBroadcaster) {
		if (newsBroadcaster == null) {
			return false;
		}

		this.newsBroadcaster = newsBroadcaster;
		return true;
	}

}
