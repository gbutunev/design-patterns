package mediatorAndSingleton;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Chatroom chatroom = new Chatroom();
		User u1 = new User("user1");
		User u2 = new User("user2");
		User u3 = new User("user3");

		chatroom.addUser(u1);
		chatroom.addUser(u2);
		chatroom.addUser(u3);

		// quick input
		int i = 1;
		while (true) {
			switch (i) {
			case 1:
				System.out.print("input 1: ");
				u1.sendMessage(scan.nextLine());
			case 2:
				System.out.print("input 2: ");
				u2.sendMessage(scan.nextLine());
			case 3:
				System.out.print("input 3: ");
				u3.sendMessage(scan.nextLine());
			default:
				i = 1;
			}
		}
	}

}
