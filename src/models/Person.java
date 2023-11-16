package models;

import Interfaces.Notifier;
import Observer.Messenger;
import Observer.Subscriber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Person {
    private String name;
    private ArrayList<Messenger> messengers = new ArrayList<>();
    private HashMap<String, Notifier> subscribers = new HashMap<>();
    private HashMap<String,Messenger> namesChat = new HashMap<>();
    public Person(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Messenger> getMessengers() {
        return messengers;
    }
    public HashMap<String,Notifier> getSubscribers() {
        return subscribers;
    }
    public HashMap<String,Messenger> getNamesChat() {
        return namesChat;
    }
}
