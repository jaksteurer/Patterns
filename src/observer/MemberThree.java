package observer;

public class MemberThree implements Observer{

	public void update(Message m) {
		System.out.println("Member Three: "+ m.getMessageContent());
	}
}
