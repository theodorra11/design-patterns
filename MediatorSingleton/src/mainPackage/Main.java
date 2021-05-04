package mainPackage;

import mediator.Chat;
import mediator.ChatUser;
import mediator.MessageMediator;
import mediator.User;

public class Main {

	public static void main(String[] args) {
		MessageMediator chat = new Chat();
		
		User user1 = new ChatUser(chat, "Theodora");
		User user2 = new ChatUser(chat, "Maria");
	    User user3 = new ChatUser(chat, "Kostadin");
	    
	    user3.sendMessage("Hello!");
        user1.sendMessage("addBot");
        user2.sendMessage("cat");
		

	}

}
