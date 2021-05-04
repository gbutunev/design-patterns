package mediatorAndSingleton;

public class User {
	private String name;
	private Chatroom chatroom;
	
	public User(String name) {
		this.name = name;
	}

	public void sendMessage(String message) {
		chatroom.sendMessage(this, message);
	}
	
	public String getName() {
		return name;
	}
	
	public void setChatroom(Chatroom chatroom) {
		this.chatroom = chatroom;
	}
}
