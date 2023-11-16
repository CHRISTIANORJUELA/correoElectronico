package services;

import Observer.Messenger;
import Observer.Subscriber;
import models.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class PersonData {
    private static ArrayList<Person> personArrayList = new ArrayList<>();

    public void setPersonData(Person person){
        personArrayList.add(person);
    }

    public Optional<Stream<Person>> findPerson(String name){
        return Optional.of(personArrayList.stream()
                .filter(p->p.getName().equalsIgnoreCase(name))
                .limit(1));
    }

    public void presentValue(Person person,Person personText,String key){
        if (!person.getNamesChat()
                .keySet()
                .stream()
                .anyMatch(p -> p.equalsIgnoreCase(key))){
                 setNameInKey(person,personText,key);
                 setSuscriber(person,personText);
        // setObserver(person,personText);
        }
    }

    public void setSuscriber(Person person,Person personText){
        Subscriber subscriber = new Subscriber(person);
        subscriber.addObserber(
                person.getNamesChat().get(personText.getName())
        );
        person.getSubscribers().put(personText.getName(),subscriber);
    }
    public void setNameInKey(Person person,Person personText,String key){
        Messenger messenger = new Messenger(person,personText);
        person.getNamesChat().put(key,messenger);
    }



}
