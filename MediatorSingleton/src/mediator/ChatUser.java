package mediator;

public class ChatUser extends User {

	public ChatUser(MessageMediator mediator, String name) {
		super(mediator, name);
		mediator.addUser(this);
	}

	@Override
	public void sendMessage(String message) {
		System.out.println(this.name +  " says: " + message);
		mediator.sendMessage(message, this);

	}

	@Override
	public void receiveMessage(String message) {
		System.out.println(this.name +  " receive: " + message);
		

	}

}
