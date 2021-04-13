package observer;
import java.util.ArrayList;
import java.util.List;

public class MessageGroup extends Subject{

	//in der Liste sind die Observer eingetrage
	//beim Aufruf werden alle einträge der Liste durchgegangen
	//und jeder wird benachrichtigt
	private List<Observer> observers = new ArrayList<>();

	public void attach(Observer o) {
		observers.add(o);
	}
	public void detach(Observer o) {
		observers.remove(o);
	}
	public void notifyUpdate(Message m) {
		for(Observer o:observers) {
			o.update(m);
		}
		
	}

}
