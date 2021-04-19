package observer;

public class Article {

	private String name;
	private String content;

	public Article(String name, String content) {
		this.name = name;
		this.content = content;
	}

	@Override
	public String toString() {
		return String.format("%s%n%n%s", name, content);
	}

}
