package mediator;

import java.util.ArrayList;
import java.util.List;

import singleton.ChatBot;

public class Chat implements MessageMediator {

	private List<User> users;
	private ChatBot chatBot;

	public Chat() {
		this.users = new ArrayList<>();
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);

	}

	@Override
	public void sendMessage(String message, User user) {

		switch (message) {
		case "addBot":
			chatBot = ChatBot.getInstance();

			for (User listUser : this.users) {

				if (listUser != user) {
					listUser.receiveMessage(message);

				}
			}
			break;

		case "cat":
			if (chatBot != null) {

				users.remove(user);
				for (User listUser : this.users) {

					if (listUser != user) {
						listUser.receiveMessage("Cat is not allowed to be used in this chat!");

					}
				}
			} else {
				for (User chatUser : this.users) {
					if (user != chatUser) {
						chatUser.receiveMessage(message);
					}
				}
			} 
			break;
			
			default:
				for (User chatUser : this.users) {
					if (user != chatUser) {
						chatUser.receiveMessage(message);
					}
				}
				

		}

	}

}
