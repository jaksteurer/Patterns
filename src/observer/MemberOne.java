package observer;

public class MemberOne implements Observer {

	public void update(Message m) {
		System.out.println("Member One: "+ m.getMessageContent());
	}
}
