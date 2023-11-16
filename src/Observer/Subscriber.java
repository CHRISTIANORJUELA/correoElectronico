package Observer;

import Interfaces.Notifier;
import Interfaces.Observer;
import models.Person;

import java.util.ArrayList;

public class Subscriber implements Notifier {
    private Person ownChannel;
    private ArrayList<Observer> observers = new ArrayList<>();

    public Subscriber(Person ownChannel){
        this.ownChannel = ownChannel;
    }
    @Override
    public void notificate(Person person,Observer observer,String message) {
        for (Observer obj:observers) {
            obj.update(observer.getNamePerson()+" : "+message);
        }
        Observer observerLast = person.getNamesChat().get(this.ownChannel.getName());
        observerLast.update(this.ownChannel.getName()+" : "+message);
    }

    public void addObserber(Observer observer){
        this.observers.add(observer);
    }
}
