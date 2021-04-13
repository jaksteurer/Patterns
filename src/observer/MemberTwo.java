package observer;

public class MemberTwo implements Observer{

	public void update(Message m) {
		System.out.println("Member Two: "+ m.getMessageContent());
	}
}
