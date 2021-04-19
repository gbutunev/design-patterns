package observer;

import java.util.ArrayList;
import java.util.Collection;

public class NewsBroadcaster implements Observable {

	private Collection<Observer> newsReceivers;
	private Article article;

	public NewsBroadcaster() {
		newsReceivers = new ArrayList<>();
	}

	@Override
	public boolean subscribe(Observer receiver) {
		return newsReceivers.add(receiver) && receiver.setObservable(this);
	}

	@Override
	public boolean unsubscribe(Observer receiver) {
		return newsReceivers.remove(receiver);
	}

	@Override
	public boolean notifySubscribers() {
		boolean value = true;

		for (var receiver : newsReceivers) {
			boolean status = receiver.update();
			if (!status)
				value = false;
		}

		return value;
	}

	@Override
	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;

		this.notifySubscribers();
	}

}
