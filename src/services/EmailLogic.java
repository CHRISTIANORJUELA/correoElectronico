package services;

import Observer.Messenger;
import models.Person;

import javax.swing.*;
import java.util.stream.Stream;

public class EmailLogic {
    PersonData personData = new PersonData();
    public void initChat(){
        String of = JOptionPane.showInputDialog("Ingresa de quién es el correo");
        String forText = JOptionPane.showInputDialog("Para quién es el correo");
        String message = JOptionPane.showInputDialog("Ingresa el mensaje que le quieres mandar");
        Person owner = find(of);
        Person person = find(forText);
        personData.presentValue(owner,person,person.getName());
        personData.presentValue(person,owner,owner.getName());

        owner.getSubscribers()
                .get(person.getName())
                .notificate(person,owner.getNamesChat().get(person.getName()),message);

        System.out.println("*".repeat(10));
        System.out.println("*".repeat(10));
        System.out.println(" owner "+owner.getName()+" tiene los siguientes chats");
        owner.getNamesChat().forEach((k,v)-> System.out.println(" Chat "+k+" : "+v.getConversation().getConversation()));
        System.out.println(" Receptor "+person.getName()+" tiene los siguientes chats");
        person.getNamesChat().forEach((k,v)-> System.out.println(" Chat "+k+" : "+v.getConversation().getConversation()));
    }

    public void sawChats(){
        String name = JOptionPane.showInputDialog("Ingresa de quién el nombre de la persona");
        Person owner = find(name);
        owner.getNamesChat().forEach((k,v)-> System.out.println("Nombres con chats"+k));
    }

    public Person find(String name){
        return personData
                .findPerson(name)
                .flatMap(Stream::findFirst)
                .orElseThrow();
    }



}
