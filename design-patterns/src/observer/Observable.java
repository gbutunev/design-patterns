package observer;

public interface Observable {

	boolean subscribe(Observer observer);

	boolean unsubscribe(Observer observer);

	boolean notifySubscribers();

	Article getArticle();

}
