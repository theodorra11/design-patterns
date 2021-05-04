package singleton;

public class ChatBot {
	
	private static ChatBot instance;

	public ChatBot() {
		// TODO Auto-generated constructor stub
	}
	
	public static ChatBot getInstance() {
		
		if(instance == null) {
			instance = new ChatBot();
		}
		
		return instance;
	}
	
	

}
